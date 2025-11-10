public class Operators{
    public static void main(String[] arghs){
        // unary operator 

        int a=10;
        int b=a++;
        System.out.println("After unary operation:");
        System.out.println(a);
        System.out.println(b);

        // binary operator
        int x=5;
        int y=10;
        System.out.println("After binary operation:");
        System.out.println(x+y);

        // ternary operator
        int age=18;
        String result=(age>=18)?"adult":"not adult";
        System.out.println("After ternary operation:");
        System.out.println(result);

        // assignment operator
        int m=10;
        int n=5;
        System.out.println("After assignment operation:");
        System.out.println(m += n);
        System.out.println(m -= n);
        System.out.println(m *= n);
        System.out.println(m /= n);
        System.out.println(m %= n);

        // Arithmetic operator
        int p=15;
        int q=4;
        System.out.println("After arithmetic operation:");
        System.out.println(p + q);
        System.out.println(p - q);
        System.out.println(p * q);
        System.out.println(p / q);
        System.out.println(p % q);

        // Comparison operator
        int u=10;
        int v=20;
        System.out.println("After comparison operation:");
        System.out.println(u == v);
        System.out.println(u != v);
        System.out.println(u > v);
        System.out.println(u < v);
        System.out.println(u >= v);
        System.out.println(u <= v);

        // Logical operator
        boolean c=true;
        boolean d=false;
        System.out.println("After logical operation:");
        System.out.println(c && d);
        System.out.println(c || d);
        System.out.println(!c);

    }
}