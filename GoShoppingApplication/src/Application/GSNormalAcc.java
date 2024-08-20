package Application;

import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Dear " + getAccNm() + ", your total charges are: " + charges + " with delivery charges: " + getDeliveryCharges());
    }

    @Override
    public String toString() {
        return "Dear " + getAccNm() + ", your total charges are: " + getCharges() + " with delivery charges: " + getDeliveryCharges();
    }
}
