package Application;

import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

public class GSShopFactory implements ShopFactory {

    @Override
    public GSprimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSprimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }
}
