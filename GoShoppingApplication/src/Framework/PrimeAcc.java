package Framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private float deliveryCharges;
	public PrimeAcc(int accNo, String accNm, int charges,float deliveryCharges,Boolean isPrime) {
		super(accNo, accNm, charges, deliveryCharges);
		this.isPrime= isPrime;
	}
	
	public void bookProduct(float charges) {
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
	

}
