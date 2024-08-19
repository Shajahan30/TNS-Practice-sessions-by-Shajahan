package Framework;

public abstract class ShopAcc {
	private int accNo;
	protected String accNm;
	private int charges;
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
	public int getCharges() {
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
	
	public ShopAcc(int accNo, String accNm, int charges, float deliveryCharges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
		this.deliveryCharges = deliveryCharges;
	}
	public void bookProduct() {
		
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
