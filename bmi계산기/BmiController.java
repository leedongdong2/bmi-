package BMI;

import java.util.ArrayList;
import java.util.List;

public class BmiController {
	static List<BmiS> list = new ArrayList<BmiS>();
	
	String append(BmiS b) {
		String msg = "저장되엇습니다";
		list.add(b);
		return msg;
	}
	
	String BmiCalculation(BmiS b) {
		int height = Integer.parseInt(b.getHeight());
		int weight = Integer.parseInt(b.getWeight());
		double result = ((double)weight/(height*height))*10000;
		String msg = String.format("%.2f", result);
		return msg;
	}

}
