import java.util.Scanner;
public class Calculator2
{
    public void math(int a , int b){
        //int valueA = a;
        //int valueB= b;
        int c=a+b;
        int d=a*b;
        int e=a-b;
        int f=a/b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int valueA = sc.nextInt();
        System.out.println("Enter second value");
        int valueB = sc.nextInt();
        Calculator2 obj = new Calculator2();
        obj.math(valueA, valueB);
    }

}