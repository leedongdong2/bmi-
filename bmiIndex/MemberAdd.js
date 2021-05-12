const sign = document.getElementById("sign");
const xhr = new XMLHttpRequest();


function MemberAdd(){
const sf = document.signForm
const mid = sf.newId.value;
const password = sf.newPwd.value;
const email = sf.email.value;
const age = sf.age.value;
let gender = "";
for(var i=0;i<2;i++){
    if(sf.gender[i].checked){
        gender = sf.gender[i].value;
    }
    }



    
}











sign.addEventListener("click",MemberAdd);






