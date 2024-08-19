package Application;

import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

public class GSShopFactory implements ShopFactory{
	public GSprimeAcc getNewPrimeAcc(long AccNo, String accNm, float charges, Boolean isPrime ) {
		GSprimeAcc primeAcc = new GSprimeAcc(0, "Default", 0, charges, isPrime);
		
		return primeAcc;
		
	}
public GSNormalAcc getNewNormalAcc(long AccNo, String accNm, float charges, float deliveryCharges ) {
		GSNormalAcc normalAcc= new GSNormalAcc(0, "Default", 0, deliveryCharges);
		
		return normalAcc;
		
	}
@Override
public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
	// TODO Auto-generated method stub
	return null;
}

}
