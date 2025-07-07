import java.util.Scanner;

public class AssignmentOperator{
	public static void main(String[] args){
		int a=20;
		int b=10;
		System.out.println("Initial Values: ");
		System.out.println("a = " +a);
		System.out.println("b = " + b );
		
		a=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a = 20;
		
		a+=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a-=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a*=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a/=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a%=b;
		System.out.println("\nAfter a=b: ");
		System.out.println("a = " +a);
		
		a = 20;
		
		a>>=1;
		System.out.println("\nAfter a>>=1: ");
		System.out.println("a = " +a);
		
		a<<=2;
		System.out.println("\nAfter a>>=1: ");
		System.out.println("a = " +a);
	}
}	