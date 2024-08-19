package Application;

import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, int charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}


	public void bookProduct(float charges) {
		System.out.println("Dear "+accNm+ " your product charges are:"+charges+" with delivery charges:"+deliveryCharges);
	}


	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharges=" + deliveryCharges + ", accNm=" + accNm + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()="
				+ getCharges() + ", getDeliveryCharges()=" + getDeliveryCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	

}
