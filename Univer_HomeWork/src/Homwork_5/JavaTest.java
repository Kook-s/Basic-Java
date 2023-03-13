package Homwork_5;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape[] = new Shape[3];
		shape[0] = new Square(4);
		shape[1] = new Circle(2);
		shape[2] = new Square(5);

		for (Shape s : shape) {
			printShape(s);
		}
	}

	public static void printShape(Shape shape) {
		System.out.print("Area:" + shape.getArea());
		System.out.println(" , Perimeter:" + shape.getPerimeter());
	}

}

abstract class Shape {
	protected abstract double getArea();
	protected abstract double getPerimeter();
}

class Square extends Shape{
    int side;
    Square(int side){
    	this.side=side;
    }
    
	protected double getArea(){
		return 4*side;
	}

	protected double getPerimeter() {
		return side*side;
	}
}

class Circle extends Shape{
	int diameter;
	Circle(int diameter ){
		this.diameter=diameter;
	}
	protected double getArea(){
		return 3.14*diameter*diameter;
		//System.out.print(3.14*diameter*diameter);
	}

	protected double getPerimeter() {
		return  2*3.14*diameter;
	}
}
