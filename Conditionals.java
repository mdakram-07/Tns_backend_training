import java.util.Scanner;
public class Conditionals{
    public static void main(String[] args){

            // if else condition
        Scanner sc=new Scanner(System.in);    
        int cash=sc.nextInt();
        if (cash<10)
            System.out.println("cannot buy anything");
        else if(cash>10 && cash < 40)
        System.out.println("can get atleast one thing");
        else
        System.out.println("can get both thing");


        // Switch case

        int month=sc.nextInt();
        switch(month) {
            case 1:
            System.out.println("jan");
            break;
            case 2:
            System.out.println("feb");
            break;
            case 3:
            System.out.println("mar");
            break;
            default:
            System.out.println("apr-dec");
        }
    }
}