const overlay = document.getElementById("overlay")
const popup = document.getElementById("popup")
const btnNoleggio = document.getElementById("btn-noleggia")
const btnAnnulla = document.getElementById("btn-annulla")

btnNoleggio.addEventListener("click", function () {

    overlay.style.display = "block"
    popup.style.display = "block"
    popup.classList.toggle("show")


})

btnAnnulla.addEventListener("click", function() {
    overlay.style.display = "none"
    popup.style.display = "none"
    popup.classList.toggle("show")
})