interface operations{
	float opra(float a, float b);
}
public class Question1 {

	public static void main(String[] args) {
		
		operations Addition=(a,b)->(a+b); 
		operations Subtract=(a,b)->(a-b);
		operations Multiplication=(a,b)->(a*b);
		operations Division=(a,b)->(a/b);
		System.out.println("Addition: "+Addition.opra(13, 5));
		System.out.println("subtraction: "+Subtract.opra(13, 5));
		System.out.println("multipication: "+Multiplication.opra(13, 5));
		System.out.println("division: "+Division.opra(13, 5));
		

	}

}
