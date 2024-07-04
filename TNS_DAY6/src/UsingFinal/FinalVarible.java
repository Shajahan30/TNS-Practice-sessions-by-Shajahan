package UsingFinal;

public class FinalVarible {
	
	
		final int x=100;
	
		final static int y;
		
		final static int z = 10;
		
		void change() {
//			x=30; //final variables can't be reassigned 
//			y=200; //final static variables can't be reassigned 
		}

		@Override
		public String toString() {
			return "FinalVarible [x=" + x + ", y=" + y +"]";
		}
		

		static {
			y=20;
			//z=100;// once initialized can't be reassigned 
			System.out.println("Value of Y :" + y);
		}
		

}
