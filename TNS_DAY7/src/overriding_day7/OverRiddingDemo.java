package overriding_day7;

public class OverRiddingDemo {
	public static void main(String[] args) {
		RBI rbi;
		
		rbi= new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi= new ICICI();
		System.out.println(rbi.getRateOfInterest());
	}
	
	

}
