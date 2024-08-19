package Application;

import Framework.PrimeAcc;

public class GSprimeAcc extends PrimeAcc {

	public GSprimeAcc(int accNo, String accNm, int charges, float deliveryCharges, Boolean isPrime) {
		super(accNo, accNm, charges, deliveryCharges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime customer "+accNm+ " your charges are: "+charges);
		
	}


	@Override
	public String toString() {
		return "GSprimeAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	

}
