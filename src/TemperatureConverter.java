
public class TemperatureConverter {
	public String convertTemp(int temperature, char convertTo) {
		if (convertTo == 'F') {
			return String.valueOf(temperature * 9 / 5 + 32);
		} else if (convertTo == 'C') {
			return String.valueOf((temperature - 32) * 5 / 9);
		} else {
			return "Bad data";
		}
	}
	
	public static void main(String[] args) {
		
		//1. convert from F to C
		
		TemperatureConverter tc = new TemperatureConverter();
		
		System.out.println(tc.convertTemp(212, 'C'));
		
		System.out.println(tc.convertTemp(32, 'C'));
		
 		//2. convert from C to F
		
		System.out.println(tc.convertTemp(100, 'F'));
		
		System.out.println(tc.convertTemp(0, 'F'));
		
		
		
		
		
		
		
		
	}

}
