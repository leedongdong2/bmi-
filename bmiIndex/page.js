//id
const login = document.getElementById("login");
const firstbox = document.getElementById("firstbox");
const secondbox = document.getElementById("secondbox")
const signupbtn = document.getElementById("signUp")
const logbox = document.getElementById("logbox");
const signbox = document.getElementById("signbox");
const bmiCheckBox = document.getElementById("bmiCheckBox");
const moveLeft = document.getElementsByClassName("moveLeft");
const moveRight = document.getElementsByClassName("moveRight");
const bmiBtn = document.getElementById("bmiBtn");
const bmiWeight = document.getElementById("bmiWeight");
const bmiHeight = document.getElementById("bmiHeight");
const bmiAge = document.getElementById("bmiAge");
const BMI = document.getElementById("BMI");
const obesityStatus = document.getElementById("obesityStatus");
const basalMetabolicRate = document.getElementById("basalMetabolicRate")

//style
const sizeout = "sizeout";
const disnone = "disnone";
const signboxcss = "signbox";


//function

//페이지넘기기
function showSignUp(){
    logbox.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
       
    setTimeout(function(){
        signbox.classList.remove(disnone)},1000);
}

function showBmi(){
    logbox.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
    
    setTimeout(function(){
        bmiCheckBox.classList.remove(disnone)},1000);  

}

function pageLeft(ev){
    const nonePage = ev.target.parentNode.parentNode;
    const previous = nonePage.previousElementSibling;

    nonePage.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
    setTimeout(function(){
    previous.classList.remove(disnone)},1000);
}

function pageRight(ev){
    const nonePage = ev.target.parentNode.parentNode;
    const next = nonePage.nextElementSibling;

    nonePage.classList.add(disnone);
    firstbox.classList.add(sizeout);
    setTimeout(function(){firstbox.classList.remove(sizeout)},500);
    setTimeout(function(){
    next.classList.remove(disnone)},1000);
}

/*비만도계산*/
function bmi(){
    const weight = Number(bmiWeight.value);
    const height = Number(bmiHeight.value);
    const age = Number(bmiAge.value);
    let gender = "";
    for(var i=0;i<2;i++){
    if(document.getElementsByName("bmiGender")[i].checked==true){
        gender = document.getElementsByName("bmiGender")[i].value;
    }
    }
    const bmiResult = bmicalculation(weight,height);
    BMI.value = bmiResult; 
    basalMetabolicRate.value = basalMetaBolismCalculation(weight,height,age,gender);
    obesityStatus.value = bmicheck(bmiResult);
}


function bmicalculation(w,h){
    const weight = Number(w);
    const height = Number(h);
    const calculation= (weight/(height*height))*10000;
    const result = String(calculation.toFixed(2));
    return result;
}

function basalMetaBolismCalculation(w,h,a,g){
     const weight = Number(w);
     const height = Number(h);
     const age = Number(a);
     const gender = g;
     let calculation = 0;
     let result = "";
     if(gender==="남"){
       calculation = (66.47+(13.75*weight)+(5*height)-(6.76*age));
       result = String(calculation.toFixed(2));
     }else if(gender==="여"){
       calculation = (655.1+(9.56*weight)+(1.85*height)-(6.68*age));
       result = String(calculation.toFixed(2));
     }
        return result;   
}

function bmicheck(br){
    let msg = "";
    if(br>0&&br<=18.40){
        msg = "저체중";
    }else if(br>=18.50&&br<=22.9){
        msg = "정상";
    }else if(br>=23.00&&br<=24.9){
        msg ="과체중";
    }else if(br>=25.00&&br<=29.9){
        msg = "비만";
    }else if(br>=30){
        msg ="고도비만";
    }
    return msg;
} 









//eventhadler
signupbtn.addEventListener("click",showSignUp);
login.addEventListener("click",showBmi);
Array.from(moveLeft).forEach(moveLeft => moveLeft.addEventListener("click",pageLeft));
Array.from(moveRight).forEach(moveRight => moveRight.addEventListener("click",pageRight));
bmiBtn.addEventListener("click",bmi);