public class ClassAndObject {

	public static void main(String[] args) {
	
		Rectangle rec=new Rectangle(4,5);
		System.out.println(rec.area());
		Rectangle rec1=new Rectangle(5,8); 
		System.out.println(rec1.area());
	}

}

class Student{
	int roll_no;
	String name;
	String address;
	String phoneNo;
}

class Triangle{
	int s1=3;
	int s2=4;
	int s3=5;
	Triangle(){
		int semiperimetre=(s1+s2+s3)/2;
		int area=(int)Math.sqrt(semiperimetre*(semiperimetre-s1)*(semiperimetre-s2)*(semiperimetre-s3));
		System.out.println("area of triange="+area);
		System.out.println("perimeter of triange="+(s1+s2+s3));
	}
}

class Rectangle{
	int a;
	int b;
	Rectangle(int side1,int side2){
		a=side1;
		b=side2;
	}
	int area() {
		return this.a*this.b;
	}
}