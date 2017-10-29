import java.util.Scanner;
public class eight_packs {
	void x() {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Your First Number");
		int a=ob.nextInt();
		System.out.println("Enter your second number");
		int b=ob.nextInt();
		
		
		try{
			float c=a/b;   
			System.out.println("Result"+c);
		}catch(ArithmeticException e){
			System.out.println("not divided by zero   "+e );
			
		}finally{
			
		}
		
	}
	public static void main(String [] args) {
		eight_packs bo=new eight_packs();
		bo.x();
		
	}

}