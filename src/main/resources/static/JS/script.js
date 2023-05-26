// Icona del menu e barra di navigazione
let menuIcon = document.querySelector('#menu-icon');
let navbar = document.querySelector('.navbar');

menuIcon.onclick = () => {
    menuIcon.classList.toggle('bx-x');
    navbar.classList.toggle('active');
}

// Rimuovi classe 'active' dalla navbar quando viene selezionato un link
navbar.querySelectorAll('a').forEach(link => {
    link.addEventListener('click', () => {
        navbar.classList.remove('active');
        menuIcon.classList.remove('bx-x');
    });
});

// Scroll delle sezioni e link di navigazione attivi
let sections = document.querySelectorAll('section');
let navLinks = document.querySelectorAll('header nav a');

window.addEventListener('scroll', () => {
    let currentSection = '';

    sections.forEach(sec => {
        const sectionTop = sec.offsetTop;
        const sectionHeight = sec.offsetHeight;

        if (pageYOffset >= sectionTop - 100 && pageYOffset < sectionTop + sectionHeight - 100) {
            currentSection = sec.getAttribute('id');
        }
    });

    navLinks.forEach(link => {
        link.classList.remove('active');
        if (link.getAttribute('href').slice(1) === currentSection) {
            link.classList.add('active');
        }
    });
});

// Sticky header
window.onscroll = () => {
    let header = document.querySelector('header');
    header.classList.toggle('sticky', window.scrollY > 100);
}


//transizione
window.addEventListener('DOMContentLoaded', function() {
    // Ottenere tutte le sezioni con classe "slide_text"
    var sections = document.querySelectorAll('.slide_text');
  
    // Nascondere tutte le sezioni senza testo
    sections.forEach(function(section) {
      if (section.textContent.trim() !== '') {
        section.style.opacity = '0';
        section.style.transform = 'translateX(-100%)'; // Nascondi le sezioni spostandole a sinistra
      }
    });
  
    // Mostrare le sezioni con testo con una transizione di 3 secondi dopo 1 secondo dal caricamento della pagina
    setTimeout(function() {
      sections.forEach(function(section) {
        if (section.textContent.trim() !== '') {
          section.style.transition = 'opacity 3s, transform 3s';  // Imposta la transizione a 3 secondi per opacity e transform
          section.style.opacity = '1';
          section.style.transform = 'translateX(0)'; // Mostra le sezioni spostandole verso destra
        }
      });
    }, 500);  // Attende prima di avviare la transizione
  });  