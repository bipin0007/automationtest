package concepts;

import java.util.Scanner;

public class MethodExamples {

    public static void main(String[] args) {

        int n = 20;
        if (isEven(n)) {
            System.out.println(n + " is an Even Number");
        } else {
            System.out.println(n + " is an Odd Number");
        }

        System.out.println(checkEvenAndOdd(10));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3=  sc.nextInt();
        int num4 = sc.nextInt();

        System.out.println(returnTheGreaterNumber(num1, num2));
        System.out.println(returnTheGreaterNumber(num1, num2, num3));
        System.out.println(returnTheGreaterNumber(num1,num2,num2,num4));
        int a[]={10,20,30,40,50};
        findGreatestAndSmallestAmongThem(a);
        System.out.println("***************************>>>>>>>>>>>>>>>");

        int c = sc.nextInt();


        findSecondLargestAndSecondSmallestNumber(a);
        sc.close();
    }

    /*
    ✅ Write a method that checks if a number is even or odd.
Hint: Use a method with a return type and pass an integer as an argument.
     */
    public static boolean checkEvenAndOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("Its an Even number " + num);
            return true;
        }
        return false;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /*
    ✅ Write a method that takes two numbers as input and returns the greater number.
Hint: Use a return type method with two parameters.
     */

    public static String returnTheGreaterNumber(int a, int b) {
        if (a > b) {
            return "The greater number is: " + a;
        } else if
            (b > a) {
            return "The greater number is: " + b;
        }
        else{
            return "Both numbers are equal";
        }

    }

    /*
    ✅ Write a method that takes three numbers as input and returns the greatest among them.
Hint: Modify your existing method to compare three numbers instead of two.
     */

    public static String returnTheGreaterNumber(int a, int b, int c) {
        if(a==b && b==c){
            return "All three numbers are equal.";
        }else if(a==b && a>c){
            return "The greater number is: " + a + " (two numbers are equal)";
        } else if (b==c && b>c) {
            return "The greater number is: " + b + " (two numbers are equal)"; 
            
        } else if (c==a && c>b) {
            return "The greater number is: " + c + " (two numbers are equal)";
        }
        else if (a > b && a>c) {
            return "The greater number is: " + a;
        }
        else if (b > a && b>c) {
            return "The greater number is: " + b;
        }
        else {
            return "The greater number is: " + c;
        }

    }

    /*
    Write a method that takes four numbers as input and returns the greatest among them.
Hint: Modify your existing method to compare four numbers instead of three.
     */
    public static String returnTheGreaterNumber(int a, int b, int c, int d) {
        if(a==b && b==c && c==d){
            return "All three numbers are equal.";
        }else if(a==b && a>c && a>d){
            return "The greater number is: " + a + " (two numbers are equal)";
        } else if (b==c && b>a && b>d) {
            return "The greater number is: " + b + " (two numbers are equal)";
        } else if (c==a && c>b && c>d) {
            return "The greater number is: " + c + " (two numbers are equal)";
        } else if (d==c && d>c && d>b) {
            return "The greater number is: " + d + " (two numbers are equal)";
        } else if (d == b && d > a && d > c) {
            return "The greater number is: " + d + " (two numbers are equal)";
        } else if (d == a && d > b && d > c) {
            return "The greater number is: " + d + " (two numbers are equal)";
        } else if (a > b && a > c && a > d) {
            return "The greater number is: " + a;
        }
        else if (b > a && b > c && b > d) {
            return "The greater number is: " + b;
        }
        else if (c > a && c > b && c > d) {
            return "The greater number is: " + c;
        }
        else {
            return "The greater number is: " + d;
        }

    }

    /*
    ✅ Modify the program to take a list of n numbers (instead of just 4) and find the greatest among them.
Hint: Use an array and a loop instead of hardcoding values.
     */
public static void findGreatestAmongThem(int[] a){
    if (a.length==1){
        System.out.println(" The Biggest Number is :"+ a[0]);
        return;
    }
    int greatest =a[0];

    for(int i =1; i<a.length;i++){
        if(a[i]>greatest){
            greatest=a[i];
        }
    }
System.out.println("The Biggest Number is " +greatest);
}


/*
✅ Modify the program to find both the greatest and smallest number in the array.
Hint: Use two variables: greatest and smallest, and update both inside the loop.
 */

    public static void findGreatestAndSmallestAmongThem(int[] a){
        if (a.length==1){
            System.out.println(" The Biggest Number is :"+ a[0]);
            return;
        }
        int greatest =a[0];

        int smallest = a[0];

        for(int i =0; i<a.length;i++){
            if(a[i]>greatest){
                greatest=a[i];
            }

            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("The Biggest Number is " +greatest);
        System.out.println("The smallest Number is " +smallest);
    }

    /*
    ✅ Modify the program to find the second largest and second smallest number in the array.
Hint: Use two extra variables: secondLargest and secondSmallest, and update them accordingly.
     */


    public static void findSecondLargestAndSecondSmallestNumber(int[] a) {
        if (a.length == 1) {
            System.out.println("The Biggest Number is: " + a[0]);
            System.out.println("No Second Largest or Second Smallest.");
            return;
        }

        int greatest = a[0];
        int smallest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

       for(int i =0; i<a.length;i++){
           if(a[i]>greatest) {
               secondLargest = greatest;
               greatest = a[i];
           }
           else if(a[i]>secondLargest && a[i]<greatest){
               secondLargest=a[i];
           }
           if(a[i]<smallest){
               secondSmallest=smallest;
               smallest= a[i];
           }

           else if(a[i]<secondSmallest && a[i]>smallest){
               secondSmallest= a[i];
           }

       }

        // Print results
        System.out.println("The Biggest Number is: " + greatest);
        System.out.println("The Smallest Number is: " + smallest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Number.");
        } else {
            System.out.println("The Second Largest Number is: " + secondLargest);
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest Number.");
        } else {
            System.out.println("The Second Smallest Number is: " + secondSmallest);
        }
    }













}





