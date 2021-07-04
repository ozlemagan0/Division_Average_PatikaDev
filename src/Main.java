import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int a;
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number:");
       a=sc.nextInt();
        double counter=0;
        double add=0;
       for (int i=1; i<=a; i++)
       {
           if((i%3==0)&&(i%4==0))
           {
               System.out.println(i);
               add+=i;
               counter++;
           }
       }
        double ave = add/counter;
        System.out.print("Ave:" +ave);
    }
}
