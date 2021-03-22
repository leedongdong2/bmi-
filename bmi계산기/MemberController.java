package BMI;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class MemberController {
	 	 
 static List<Member> members = new ArrayList<Member>();
 static Member target;
 static boolean log;
 
 String append(Member m,SignUp sign) {
	
 String msg = "회원가입이 정상적으로 되셧습니다";
 boolean blankcheck =  blankCheck(sign);
 boolean samecheck = sameCheck(sign); 
 boolean pwpatterncheck = pwPatternCheck(sign.newPassword.getText());
 boolean agecheck =  ageCheck(sign.newAge.getText());
 boolean sexcheck = sexCheck(sign.newSex.getText());
 boolean emailpatterncheck = emailPatternCheck(sign.newEmail.getText());
 
 if(emailpatterncheck==false) {
	 msg = "이메일형식에 맞지않습니다~";
 }
 else if(sexcheck==false) {
	 msg = "성별은 \"남\" 또는 \"여\"로만 적어주세여~";
 }
 else if(agecheck==false) {
	 msg = "나이는 3살부터100세까지만 가능하세요~";
 } else if(pwpatterncheck==false) {
	 msg = "비밀번호 형식을 맞춰주세요~";
 }else if(blankcheck==false) {
	msg = "빈칸을 채워주세요~";
}else if(samecheck==false) {
	msg = "패스워드를 두곳다 동일하게 적어주세요";
}else{ members.add(m);

}

return msg;
}
	
 
boolean login(String id,String password) {
	log = false;
	for(int i=0;i<members.size();i++) {
		target = members.get(i);
		if(target.getId().equals(id)&&target.getPassword().equals(password)) {
			log = true;
			break;
		}else {
			log = false;
		}
	}
	return log;
}

String upDate(Member m,SignCange sc) {
	String msg = "정상적으로 업데이트 되었습니다";
	
	
	
	boolean blackCheck = blankCheck(sc);
	boolean sameCheck = sameCheck(sc.setPassword.getText(), sc.newPassword.getText());
	boolean newsameCheck = newsameCheck(sc.newPassword.getText(),sc.ckNewPassword.getText());	
	
	if(blackCheck==false) {
		msg = "빈칸을 채워 주세요~";
	}else if(sameCheck==false) {
		msg = "기존비밀번호와 다르게 해주세요~";
	}else if(newsameCheck==false) {
		msg = "새로운 비밀번호를 두번다 똑같이 입력해주세요~";
	} else {
	
	for(int i = 0;i<members.size();i++) {
		Member t = members.get(i);
		if(target.getId().equals(t.getId())) {
			members.set(i, m);
			break;
		}
	}
	}
	return msg;
}
String delete() {
	
	String msg = "삭제되었습니다";
	if(log ==true) {
		for(int i=0;i<members.size();i++) {
			Member t = members.get(i);
			if(target.getId().equals(t.getId())) {
				members.remove(i);
				log = false;
				break;
			}
		}
		
	}
	return msg;
}






















Idcheck idCheck(Idcheck check) {
	Idcheck checking = check;
	boolean idpatterncheck = idPatternCheck(check.getId());
	
	if(idpatterncheck==false) {
		checking.setCheck(false);
		checking.setMsg("아이디 형식을 제대로해주세요");
		return checking;
	}
	
	for(int i = 0;i<members.size();i++) {
	Member m = members.get(i);
		if(checking.getId().equals(m.getId())) {
         checking.setCheck(false);
         checking.setMsg("동일한 아이디가 있습니다");
	}else if(checking.getId().equals("")) {
		 checking.setCheck(false);
		 checking.setMsg("아이디를 입력해주세요");
	}	else if(!(checking.getId().equals(m.getId()))) {
		checking.setCheck(true);
		checking.setMsg("사용가능한 아이디 입니다");
	}
	}
	
	
	return checking;
}


//패턴체크 
boolean idPatternCheck(String a){
	boolean check = true;
	
	String reg = "[A-Za-z0-9]{6,12}";
    Pattern p = Pattern.compile(reg);
    Matcher m = p.matcher(a);
    if(!(m.matches())) {
    	check = false;
    }
	return check;
}

boolean pwPatternCheck(String a){
	boolean check = true;
	
	String reg =  "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,12}$";
    Pattern p = Pattern.compile(reg);
    Matcher m = p.matcher(a);
    if(!(m.matches())) {
    	check = false;
    }
	return check;
}


boolean emailPatternCheck(String a){
	boolean check = true;
	
	String reg =  "^[A-z0-9]([A-z0-9]*)(@)([A-z]*)(\\.)([A-z]*)$";
    Pattern p = Pattern.compile(reg);
    Matcher m = p.matcher(a);
    if(!(m.matches())) {
    	check = false;
    }
	return check;
}


boolean ageCheck(String a) {
	boolean check = true;
	int age = Integer.parseInt(a);
	if(!(age>2&&age<101)) {
		check = false;
	}
	
	
	return check;
}

boolean sexCheck(String a) {
	boolean check = true;
	if(!(a.equals("남")||a.equals("여"))) {
		check = false;
	}
	
	
	return check;
}













boolean blankCheck(SignUp sign) {
	boolean check = true ;
	if(sign.newId.getText().equals("")||
   sign.newPassword.getText().equals("")||
  sign.ckPassword.getText().equals("")||
  sign.newAge.getText().equals("")||
  sign.newSex.getText().equals("")||
  sign.newEmail.getText().equals("")) 
	{
		  check = false;
	}	
	return check;
}


boolean sameCheck(SignUp sign) {
	boolean check = true;
	if(!(sign.newPassword.getText().equals(sign.ckPassword.getText()))){
		check = false;
	}	
	return check;
}


 
 
 boolean blankCheck(SignCange sc) {
		boolean check = true ;
	if(sc.newPassword.getText().equals("")||
	   sc.ckNewPassword.getText().equals("")||
	   sc.setsex.getText().equals("")||
	   sc.setAge.getText().equals("")||
	   sc.setEmail.getText().equals("")) {
		check = false;
	}
	
		return check;
	}
 
 
 
 boolean sameCheck(String a, String b) {
	 
		boolean check = true;
		if(a.equals(b)){
			check = false;
		}
		return check;

 }
 
 boolean newsameCheck(String a, String b) {
	 
		boolean check = false;
		if(a.equals(b)){
			check = true;
		}
		return check;

}
 
 
 
 
 
 
 
 
 
 
 
 
 }
 
 

 