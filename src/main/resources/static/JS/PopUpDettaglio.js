const overlay = document.getElementById("overlay")
const popup = document.getElementById("popup")
const btnNoleggio = document.getElementById("btn-noleggia")
const btnAnnulla = document.getElementById("btn-annulla")

btnNoleggio.addEventListener("click", function () {

    console.log(btnNoleggio)
    overlay.style.display = "block"
    popup.classList.toggle("show")


})

btnAnnulla.addEventListener("click", function() {
    overlay.style.display = "none"
    popup.classList.toggle("show")
})