package UsingFinal;

class FinalMethodClass {

	//constructor 
	  FinalMethodClass() {
		System.out.println("This is a default constructor ");
	}
	  final int a = 50;
	  
	  //final method
	  void show ()
	  {
		  System.out.println("Value of a :" + a);
	  }
	

}
