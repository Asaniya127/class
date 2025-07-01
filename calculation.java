public class calculation {
    public void math(){
        int a = 5;
        int b=6;
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
        calculation obj = new calculation();
        obj.math();
    }

}
