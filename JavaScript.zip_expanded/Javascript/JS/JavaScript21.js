function checkName() 
{
    var nameInput = document.getElementById("name");
    var errorMessage = document.getElementById("errorMessageName");

    if (nameInput.value.trim() === "") 
    {
        errorMessage.style.visibility = "visible";
        nameInput.style.backgroundColor = "red";
    } 
    else 
    {
        errorMessage.style.visibility = "hidden";
        nameInput.style.backgroundColor = "white";
    }
}

function checkAdress() 
{
    var adressInput = document.getElementById("adress");
    var errorMessage = document.getElementById("errorMessageAdress");

    if (adressInput.value.trim() === "") 
    {
        errorMessage.style.visibility = "visible";
        adressInput.style.backgroundColor = "red";
    } 
    else 
    {
        errorMessage.style.visibility = "hidden";
    	adressInput.style.backgroundColor = "white";
    }
}


function checkTel() 
{
    var telInput = document.getElementById("tel");
    var errorMessage = document.getElementById("errorMessageTel");

    if (telInput.value.trim() === "") 
    {
        errorMessage.style.visibility = "visible";
        telInput.style.backgroundColor = "red";
    } 
    else 
    {
        errorMessage.style.visibility = "hidden";
    	telInput.style.backgroundColor = "white";
    }
}

