/**
 * 
 */

 /*변수들*/
 const sign = document.getElementById("sign");
 const xhr = new XMLHttpRequest();
 const idcheckbtn = document.getElementById("idCheck");
 const sf = document.signForm;
 const passConfirm = document.getElementsByClassName("passConfirm");
 const login = document.getElementById("login");
/*로그인  폼 */
 const lf = document.loginForm;
 
 
 /*중복 체크 변수들*/
 let idCheckresult = false;
 let passboolean = false ;
 
 /*회원가입 함수*/
function MemberAdd(){
	
  if(idCheckresult === false){
    alert("아이디중복체크를 먼저 해주세요");
  } else if(passboolean === false){
    alert("패스워드를 체크해주세요!");
  }else if(idCheckresult === true && passboolean === true){
 let mid = sf.newId.value;
 let password = sf.newPwd.value;
 let email = sf.email.value;
 let age = sf.age.value;
 let gender = "";
 for(var i=0;i<2;i++){
   if(sf.gender[i].checked){
       gender = sf.gender[i].value;
   }
   }
 let url = "MemberAdd.jsp"
 url = url + "?mid=" + mid +"&password=" + password + "&email=" + email +"&age=" + age + "&gender=" + gender ;

 xhr.open("get",url);
 xhr.send();
 xhr.onreadystatechange = function(){
   if(xhr.status==200 && xhr.readyState==4){
       const result = xhr.responseText;
       alert(result);
          sf.newId.value="";
          sf.newPwd.value="";
          sf.chekPwd.value="";
          sf.email.value="";
          sf.age.value="";
          for(var j=0;j<2;j++){
          if(sf.gender[j].checked==true){
          sf.gender[j].checked = false;
          }
          }
          movePage(signbox,logbox);
   }
  }
  }
 }

/*아이디 중복값 체크*/

  function idCheck(){
  
  const mid = sf.newId.value;
  let url = "IdSameCheck.jsp"
  url = url +"?mid="+ mid;

  xhr.open("get",url);
  xhr.send();
  xhr.onreadystatechange = function(){
     if(xhr.readyState==4 && xhr.status==200 ){
         const textResult = xhr.responseText;
         const json = JSON.parse(textResult);
         if(json.mid == "true"){
             alert("중복된 아이디가 있습니다");
             idCheckresult = false;
         }else if(json.mid == "false"){
             alert("중복된 아이디가 없습니다");
             idCheckresult = true;
         }
     }
 }
}


/*비밀번호 변수들 */
const newPwd = document.getElementById("newPwd");
const chekPwd = document.getElementById("chekPwd");
const changePwd = document.getElementById("changePwd")
const changePwdRe = document.getElementById("changePwdRe")
const pwdChek = document.getElementById("pwdChek");
const changepwdChek = document.getElementById("changepwdChek");


/*비밀번호 확인 */
function passWordCheck(pass1,pass2,index){
    if(pass1.value==pass2.value){
        passConfirm[index].innerHTML="";
        passConfirm[index].innerHTML="비밀번호 확인 되었습니다";
        passboolean = true;

    } else if(pass1.value!=pass2.value){
        passConfirm[index].innerHTML="";
        passConfirm[index].innerHTML="비밀번호가 틀립니다"; 
        passboolean = false;
    }
}



function loginSave(){
	const loginId = lf.mid.value;
    const loginPwd = lf.pwd.value; 
  
    
   url = "LoginSave.jsp"
   url = url + "?loginId=" + loginId + "&loginPwd=" + loginPwd;
   xhr.open("get",url);
   xhr.send();
   xhr.onreadystatechange = function(){
   if(xhr.readyState==4 && xhr.status==200){

   const textResult = xhr.responseText;
   const json = JSON.parse(textResult);
   if(json.log == "false"){
	alert("로그인해주세요");
   }else if(json.log == "true"){
	lf.mid.value ="";
	lf.pwd.value="";
	bmiAge.value= json.age;
    for(var i=0;i<2;i++){
    if(document.getElementsByName("bmiGender")[i].value==json.gender){
       document.getElementsByName("bmiGender")[i].checked = true; 
    }
    }
	movePage(logbox,bmiCheckBox);
}

	
}	
} 
}










/*이벤트들*/
idcheckbtn.addEventListener("click",idCheck);
sign.addEventListener("click",MemberAdd);
pwdChek.addEventListener("click",event => passWordCheck(newPwd,chekPwd,0));
changepwdChek.addEventListener("click",event => passWordCheck(changePwd,changePwdRe,1));
login.addEventListener("click",loginSave);/**
 * 
 */