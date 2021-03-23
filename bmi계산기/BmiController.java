package BMI;

import java.util.ArrayList;
import java.util.List;

public class BmiController {
	static List<BmiS> bmlist = new ArrayList<BmiS>();
	MemberController mc = new MemberController();
	
	String append(BmiS b) {
		String msg = "저장되엇습니다";
		bmlist.add(b);
		return msg;
	}
	
	String BmiCalculation(BmiS b) {
		double height = Double.parseDouble(b.getHeight());
		double weight = Double.parseDouble(b.getWeight());
		double result = ((double)weight/(height*height))*10000;
		String msg = String.format("%.2f", result);
		return msg;
	}
	
	
	
	String BmiCalculation1(BmiS b) {
		double height = Double.parseDouble(b.getHeight());
		double weight = Double.parseDouble(b.getWeight());
		int age=Integer.parseInt(b.getAge());
		double result1 = ((double)66.47+(13.75*weight)+(5*height)-(6.76*age));
		double result2 = ((double)655.1+(9.56*weight)+(1.85*height)-(6.68*age));
		if(b.getSex().equals("남")) {
		String msg = String.format("%.2f", result1);
		return msg;
		}else {
			String msg = String.format("%.2f", result2);
			return msg;	
		}
		}
		
	
	
	
	List<BmiS> bmiSearch(){
		
		List<BmiS> list = new ArrayList<BmiS>();
		if(mc.log==true) {
		for(int i=0;i<bmlist.size();i++) {
			BmiS saved = bmlist.get(i);
		if(mc.target.getId().equals(bmlist.get(i).getId())) {
			list.add(saved);
		}
		}
		}
		
		return list;
	}
	
	void bmiDelet() {
		if(mc.log==true) {
		for(int i=0;i<bmlist.size();i++) {
			BmiS b = bmlist.get(i);
			if(mc.target.getId().equals(b.getId())) {
				bmlist.remove(i);
			}
		}
		}
	}

	String bmick(String bmi) {
		String msg = "";
		double bimint = Double.parseDouble(bmi);
		
		if(bimint>0&&bimint<=18.4) {
			msg = "저체중";
		}else if(bimint>=18.5&&bimint<=22) {
			msg = "정상";
		}else if(bimint>=23&&bimint<=24) {
			msg = "과체중";
		}else if(bimint>=25&&bimint<=29) {
			msg = "비만";
		}else if(bimint>=30) {
			msg = "고도비만";
		}
		
		return msg;
	}
	
}
