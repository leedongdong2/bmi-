
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <link rel="stylesheet" href="main.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BMI</title>
</head>
<body>
<div id='main'>
  <div class='box' id='firstbox'>
   <!---회원가입 화면-->   
    <div class='disnone' id='signbox' >
      <div class="pageMove">
        <span class='moveRight'>▶</span> 
      </div>
      <div class='signbox'>
        <h2 class='signTitle'>회원가입</h2>
        <form id='signForm' name='signForm' action='' method='POST'>
          <div>
            <label>아이디</label>
            <br/>
            <input type='text' id='newId' name='newId'/>
            <input type='button' value='중복확인' id='idCheck'/>
            <br/>
            <span>※영어,숫자(6~12자리)</span>  
          </div>
          <div>
            <label>비밀번호</label>
            <br/>
            <input type='password' id='newPwd' name='newPwd'>
            <br/>
            <label>비밀번호확인</label>
            <br/>
            <input type='password' id='chekPwd' name='chekPwd'>
            <input type='button' value="비밀번호확인" id='pwdChek' name='pwdChek'>
            <br/>
            <span class='passConfirm'>※영어,특수문자를 반드시 포함한(8~12)자리</span>
          </div>
          <div>
            <label>이메일</label>
            <br/> 
            <input type='text' id='email' name='email'>
          </div>
          <div>
            <label>나이 </label>
            <br/>
            <input type='text' id='age' name='age'>
          </div>
          <div>
            <span>성별 : </span>
            <label>남<input type='radio' value="남" name='gender'/></label>
            <label>여<input type='radio' value="여" name='gender'/></label>
          </div>
          <div>
            <input type='button' value='sign' id='sign'>
          </div>
        </form>
      </div>
    </div>

    <!---처음 login 화면 -->
    <div class='' id='logbox'>
      <h2 class='title'>비만도 계산기</h2>
      <div class='loginZone'>
        <form id='loginForm' name='loginForm' action='' method="POST">
          <div>
            <input id='mid' name='mid' type='text' placeholder='ID'/>
          </div>
          <div>
            <input id='pwd' name='pwd' type='password' placeholder='PASSWORD'/>
          </div>    
          <div class='btnZone'>
            <input type='button' value='login' id='login'/>
            <input type='button' value='signUp' id='signUp'/>
          </div>
        </form>
      </div>
    </div>

    <!-- 회원수정 화면-->
 
    <div class='disnone' id='signChangebox' >
      <div class="pageMove">
        <span class='moveRight'>▶</span> 
      </div>
      <div class='signbox'>
        <h2 class='signTitle'>회원수정</h2>
        <form id='ChangeForm' action='' method='POST'>
          <div>
            <label>아이디</label>
            <br/>
            <input type='text' id='changeId' name='changeId'/>
            <br/>
            <span>※영어,숫자(6~12자리)</span>  
          </div>
          <div>
            <label>비밀번호</label>
            <br/>
            <input type='password' id='changePwd' name='changePwd'>
            <br/>
            <label>비밀번호확인</label>
            <br/>
            <input type='password' id='changePwdRe' name='changePwdRe'>
            <input type='button' value='비밀번호확인' id='changepwdChek' name='changepwdChek'>
            <br/>
            <span class='passConfirm'>※영어,특수문자를 반드시 포함한(8~12)자리</span>
          </div>
          <div>
            <label>이메일</label>
            <br/> 
            <input type='text' id='changeEmail' name='changeEmail'>
          </div>
          <div>
            <label>나이 </label>
            <br/>
            <input type='text' id='changeAge' name='changeAge'>
          </div>
          <div>
            <span>성별 : </span>
            <label>남<input type='radio' value='man' name='gender'/></label>
            <label>여<input type='radio' value='woman' name='gender'/></label>
          </div>
          <div>
            <input type='button' value='sign' id='signChange'>
          </div>
        </form>
      </div>
    </div>
        <!---bmi측정기 화면-->
    <div id='bmiCheckBox' class='disnone'>
      <div class="pageMove">
        <span class='moveLeft'>◀</span>
        <span class='moveRight'>▶</span> 
      </div>
      <h2 class='bmiTitle'>측정(BMI)</h2> 
      <div class='bmiInputBox'>
        <div>
          <span>성별</span>
          <span>
            <label>남
              <input type='radio' name ='bmiGender' value='남' >
            </label>
            <label>여
              <input type='radio' name = 'bmiGender' value='여'> 
            </label>
          </span>        
          <br/>
          <label>나이</label>
          <input type='text' id='bmiAge'>
          <br/>
          <label>키</label>
          <input type='text' id='bmiHeight'>
          <br/>
          <label>몸무게</label>
          <input type='text' id='bmiWeight'>
          <br/>
          <input type='button' value='측정하기' id='bmiBtn'/> 
        </div> 
        <div>
            <form id='submitFrm'>
            <label>BMI</label>
            <input type='text' id='BMI' readonly>
            <br/>
            <label>비만여부</label>
            <input type='text' id='obesityStatus' readonly>
            <br/>
            <label>기초대사량</label>
            <input type='text' id='basalMetabolicRate' readonly>
            <br/>
            <input type='text' id='result' readonly>
            <br/>
            <input type='button' id='saveBtn' value='저장하기'>
          </form>
        </div>
      </div>
      <div class='logoutbox'>
        <input type='button' value='로그아웃' id='logout'>
      </div>
    </div>

    <!---검색창뷰-->
    <div class='disnone' id='searchView'>
      <div class='pageMove'>
        <span class='moveLeft'>◀</span> 
      </div>
      <h2 class='searchTitle'>BMI 기록 조회</h2>
      <div id='searchShowBox'>

      </div>
      <div>
        <input type='button' id='searchBtn' value='조회'>
      </div>
    </div>
  </div>          
</div>
<script src="MemberAdd.js"></script>
<script src="page.js"></script>
</body>
</html>