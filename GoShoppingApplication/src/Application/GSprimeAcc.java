package Application;

import Framework.PrimeAcc;

public class GSprimeAcc extends PrimeAcc {

    public GSprimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    @Override
    public void bookProduct(float charges) {
        System.out.println("Dear Prime customer " + getAccNm() + ", your total charges are: " + charges);
    }

    @Override
    public String toString() {
        return "Dear Prime customer " + getAccNm() + ", your total charges are: " + getCharges();
    }
}
