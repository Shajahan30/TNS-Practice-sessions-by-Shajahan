package AbstractClassDemo;

public class Rectangle extends Shape {
	float height;
	float width;
	@Override
	public void calArea() {
		this.height * width;
		
	}
	
	
	public Rectangle() {
		super();
	}


	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	

}
