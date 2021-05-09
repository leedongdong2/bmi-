//id
const login = document.getElementById("login");
const firstbox = document.getElementById("firstbox");
const secondbox = document.getElementById("secondbox")
const signupbtn = document.getElementById("signUp")
const logbox = document.getElementById("logbox");
const signbox = document.getElementById("signbox");
const bmiCheckBox = document.getElementById("bmiCheckBox");
//style
const sizeout = "sizeout";
const disnone = "disnone";
const signboxcss = "signbox";
//function
function showSignUp(){
    logbox.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
       
    setTimeout(function(){
        signbox.classList.remove(disnone);
        signbox.classList.add(signboxcss)},1001);  
}

function showBmi(){
    logbox.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
    
    setTimeout(function(){
        bmiCheckBox.classList.remove(disnone)},1000);  

}









//eventhadler
signupbtn.addEventListener("click",showSignUp);
login.addEventListener("click",showBmi);