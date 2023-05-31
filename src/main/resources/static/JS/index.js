const btnNewsLetter = document.getElementById("btn-newsletter")
const emailNewsLetter = document.getElementById("email-newsletter")
const confermaNewsLetter = document.getElementById("conferma-newsletter")

btnNewsLetter.addEventListener("click", function(){
	btnNewsLetter.style.display = "none"
	emailNewsLetter.style.display = "none"
	confermaNewsLetter.style.display = "block";
})