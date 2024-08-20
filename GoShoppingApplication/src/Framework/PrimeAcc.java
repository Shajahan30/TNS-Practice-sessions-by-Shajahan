package Framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;

    
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, charges);  
        this.isPrime = isPrime;
    }

    
    public void bookProduct(float charges) {
        
        System.out.println("Dear Prime customer " + getAccNm() + ", your total charges are: " + charges);
    }

    
    @Override
    public String toString() {
        return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
                + ", getCharges()=" + getCharges() + "]";
    }

    
    public boolean isPrime() {
        return isPrime;
    }
}
