const observery = new IntersectionObserver((entries) => {
entries.forEach((entry) => {
    console.log(entry);
    if (entry.isIntersecting) {
    entry.target.classList.add('showy');
    } else {
    entry.target.classList.remove('showy');
    }
});
});

const hiddenElementsy = document.querySelectorAll('.hiddeny');
hiddenElementsy.forEach((el) => observery.observe(el));



const observerz = new IntersectionObserver((entries) => {
entries.forEach((entry) => {
    console.log(entry);
    if (entry.isIntersecting) {
    entry.target.classList.add('showz');
    } else {
    entry.target.classList.remove('showz');
    }
});
});

const hiddenElementsz = document.querySelectorAll('.hiddenz');
hiddenElementsz.forEach((el) => observerz.observe(el));



const observerx = new IntersectionObserver((entries) => {
entries.forEach((entry) => {
    console.log(entry);
    if (entry.isIntersecting) {
    entry.target.classList.add('showx');
    } else {
    entry.target.classList.remove('showx');
    }
});
});

const hiddenElementsx = document.querySelectorAll('.hiddenx');
hiddenElementsx.forEach((el) => observerx.observe(el));



const observerxfilm = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
        console.log(entry);
        if (entry.isIntersecting) {
        entry.target.classList.add('showxfilm');
        } else {
        entry.target.classList.remove('showxfilm');
        }
    });
    });
    
    const hiddenElementsxfilm = document.querySelectorAll('.hiddenxfilm');
    hiddenElementsxfilm.forEach((el) => observerxfilm.observe(el));

    

    const observerxlibro = new IntersectionObserver((entries) => {
        entries.forEach((entry) => {
            console.log(entry);
            if (entry.isIntersecting) {
            entry.target.classList.add('showxlibro');
            } else {
            entry.target.classList.remove('showxlibro');
            }
        });
        });
        
        const hiddenElementsxlibro = document.querySelectorAll('.hiddenxlibro');
        hiddenElementsxlibro.forEach((el) => observerxlibro.observe(el));