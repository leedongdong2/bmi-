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
		int height = Integer.parseInt(b.getHeight());
		int weight = Integer.parseInt(b.getWeight());
		double result = ((double)weight/(height*height))*10000;
		String msg = String.format("%.2f", result);
		return msg;
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
