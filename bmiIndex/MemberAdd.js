/**
 * 
 */


 const sign = document.getElementById("sign");
 const xhr = new XMLHttpRequest();


function MemberAdd(){
 const sf = document.signForm;
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
 


sign.addEventListener("click",MemberAdd);


 