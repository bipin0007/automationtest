package concepts;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
       doFactorail(sc.nextInt());
    }

    public static void doFactorail(int n){
        int fact=1;
        int i=1;
        do{
           fact= fact*i;
            i++;
        }while(i<=n);
        System.out.println("Factorial of " + n + " is : " +fact);
    }
}
