
public class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon r1=new RegularPolygon();
		System.out.println(r1);
		System.out.println("Object1's perimeter is "+r1.getPerimeter()+" area is "+r1.getArea());
		
		RegularPolygon r2=new RegularPolygon(6,4);
		System.out.println("Object2's perimeter is "+r2.getPerimeter()+" area is "+r2.getArea());
		
		RegularPolygon r3=new RegularPolygon(10,4,5.6,7.8);
		System.out.println("Object3's perimeter is "+r3.getPerimeter()+" area is "+r3.getArea());
		
	}

}
