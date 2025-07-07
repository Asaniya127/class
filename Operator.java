import java.util.Scanner;

public class Operator {
    int x,y;
    public void calculator(int x,int y){
	System.out.println("Addition of 2 no.s is :");
        System.out.println(x+y);
System.out.println("Sub of 2 no.s is :");
        System.out.println(x-y);
System.out.println("division of 2 no.s is :");
        System.out.println(x/y);
System.out.println("Multiplication of 2 no.s is :");
        System.out.println(x*y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Operator obj= new Operator();
        obj.calculator(x,y);
    }
}