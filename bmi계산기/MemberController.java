package BMI;

import java.util.ArrayList;
import java.util.List;

 class MemberController {
	 	 
 static List<Member> members = new ArrayList<Member>();
 static Member target;
 static boolean log;
String append(Member m,SignUp sign) {
	
String msg = "ȸ�������� ���������� �Ǽ˽��ϴ�";
boolean blankcheck =  blankCheck(sign);
boolean samecheck = sameCheck(sign); 

if(blankcheck==false) {
	msg = "��ĭ�� ä���ּ���~";
}else if(samecheck==false) {
	msg = "�н����带 �ΰ��� �����ϰ� �����ּ���";
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

}
