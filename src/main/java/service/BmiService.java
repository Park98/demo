package service;

public class BmiService {
	public String bmi(double height,double weight,String gender){
		String status="正常";
		double bmi = weight/height/height;
		if("m".equals(gender)){
			if(bmi<20){
				status="过轻";
			}
			if(bmi>25){
				status="过重";
			}else{
				if(bmi<19){
					status="过轻";
				}
				if(bmi>24){
					status="过重";
				}
			}
		}
	
	return "BMI:"+bmi+"体重:"+status;
	}

}
