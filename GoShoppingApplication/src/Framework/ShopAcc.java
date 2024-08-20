package Framework;

public abstract class ShopAcc {
	private int accNo;
	protected String accNm;
	private float charges;
	private float deliveryCharges;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(float deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	public ShopAcc(int accNo, String accNm, float charges2, float deliveryCharges2) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges2;
		this.deliveryCharges = deliveryCharges;
	}
	public ShopAcc(int accNo2, String accNm2, int charges2) {
		// TODO Auto-generated constructor stub
	}
	public static void bookProduct() {
		
	}
	public void items() {
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", deliveryCharges="
				+ deliveryCharges + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()="
				+ getCharges() + ", getDeliveryCharges()=" + getDeliveryCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
