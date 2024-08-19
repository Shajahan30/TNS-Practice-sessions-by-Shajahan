package Client;

import Application.GSNormalAcc;
import Application.GSShopFactory;
import Application.GSprimeAcc;

public class client {

	public static void main(String[] args) {
		GSShopFactory gsacc= new GSShopFactory();
		gsacc.getNewPrimeAcc(987654, "Shajahan", 5000f, true);
		gsacc.getNewNormalAcc(123456, "Sadiya", 7000, 20f);
		gsacc.toString();
		GSprimeAcc gspa= new GSprimeAcc(1234,"Shaan",5000,20f,false);
		gspa.bookProduct(5000);
		gspa.getAccNm();
		gspa.getAccNo();
		gspa.getCharges();
		gspa.toString();
		
		GSprimeAcc gspa2= new GSprimeAcc(4566666,"Mariam",50000,40f,true);
		gspa2.bookProduct(50000);
		gspa2.getAccNm();
		gspa2.getAccNo();
		gspa2.getCharges();
		gspa2.toString();
		
		GSNormalAcc gsna= new GSNormalAcc(45678,"Hamza",8000,100f);
		gsna.bookProduct(8000);
		gsna.getAccNm();
		gsna.getAccNo();
		gsna.getDeliveryCharges();
		gsna.toString();
		
		GSNormalAcc gsna2= new GSNormalAcc(45678,"Kiran",80000,50f);
		gsna2.bookProduct(80000);
		gsna2.getAccNm();
		gsna2.getAccNo();
		gsna2.getDeliveryCharges();
		gsna2.toString();


	}

}
