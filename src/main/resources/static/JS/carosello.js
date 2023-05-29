const carousel = document.querySelector(".carousel"),
firstImg = carousel.querySelectorAll("img") [0],
arrowIcons = document.querySelectorAll(".wrapper i");

let isDragStart = false, prevPageX, prevScrollLeft;



const showHideIcons = () => {
    let scrollWidth = carousel.scrollWidth - carousel.clientWidth; //prende la lunghezza scrollabile massima

    if(carousel.scrollLeft == 0) {
        arrowIcons[0].style.display = "none";
    } else {
        arrowIcons[0].style.display = "block";
    }

    if(carousel.scrollLeft == scrollWidth) {
        arrowIcons[1].style.display = "none";
    } else {
        arrowIcons[1].style.display = "block";
    }
}

arrowIcons.forEach(icon => {
    icon.addEventListener("click", () => {
        let firstImgWidth = firstImg.clientWidth + 30; //prendo la larghezza della prima immagine e aggiungo 14 di margine

        // se l'icona cliccata è a sinistra, riduce il valore della larghezza dal carosello verso sinistra
        if(icon.id == "left"){
            carousel.scrollLeft -= firstImgWidth;
        } else {
            carousel.scrollLeft += firstImgWidth;
        }
        setTimeout(() => showHideIcons(), 60); // chiama il metodo showHideIcons dopo 60ms
    });
});

//aggiornamento valore delle variabili su "mouse down event"
const dragStart = (e) => {
    isDragStart = true;
    prevPageX = e.pageX;
    prevScrollLeft = carousel.scrollLeft;
}

// scrolla le immagini verso sinistra con il puntatore del mouse
const dragging = (e) => {
    if(!isDragStart) return;
    e.preventDefault();
    carousel.classList.add("dragging");
    let positionDiff = e.pageX - prevPageX;
    carousel.scrollLeft = prevScrollLeft - positionDiff;
    showHideIcons();
}

const dragStop = () => {
    isDragStart = false;
    carousel.classList.remove("dragging");
}

carousel.addEventListener("mousedown", dragStart);
carousel.addEventListener("mousemove", dragging);
carousel.addEventListener("mouseup", dragStop);
carousel.addEventListener("mouseleave", dragStop);