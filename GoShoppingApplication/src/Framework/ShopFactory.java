package Framework;

import Framework.NormalAcc;
import Framework.PrimeAcc;

public interface ShopFactory {
    PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
    NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharge);
}
