package concepts;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

System.out.println("Printing the number is Prime Number or Not");
        System.out.println(checkNumberIsPrimeNumberOrNot(5));
        System.out.println("Printing the number is Prime Number or Not ");
        System.out.println(checkNumberIsPrimeNumberOrNotUsingSquareRoot(7));
        checkNumberIsPrime(23);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get the Prime Number from 1 to n :");
        printAllTheNumberFrom1ToN(sc.nextInt());
        sc.close();
        SumOfAllTheNumberFrom1ToN(20);
        averageOfAllTheNumberFrom1ToN(4);
        findTheLargestPrimeNumberFrom1ToN(23);
        findTheSmallestPrimeNumberFrom1ToN(10);
        findTheSecondSmallestPrimeNumberFrom1ToN(23);
        findTheSecondLargestPrimeNumberFrom1ToN(23);
        findTheSumOfAllThePrimeNumbersBetweenTwoGivenNumbers(1,3);
        findTheMultiplicationOfAllThePrimeNumbersBetweenTwoGivenNumbers(1,2);
        findTheDifferenceBetweenTheLargestAndSmallestPrimeNumbersBetweenTwoGivenNumbers(10,50);
        countTheNumberOfEvenAndOddInGivenPrimeNumbersBetweenTwoGivenNumbers(10,50);
        programToCheckIfTheSumOfAllPrimeNumbersBetweenMAndNIsAlsoAPrimeNumber(50,55);
        checkIfTheProductOfAllPrimeNumbersBetweenMAndNIsAlsoAPrimeNumber(13, 50);
        System.out.print("Is this num is prime number or not "+ isPrime(11));
        findTheSmallestPrimeFactorOfTheProductOfAllPrimeNumbersBetweenMAndN(10,20);
    }
    public static boolean checkNumberIsPrimeNumberOrNot(int n) {
        if(n<=1){
            return false;
        }
        int diviserCount = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                diviserCount++;
            }
        }
return diviserCount ==2;
    }


    public static boolean checkNumberIsPrimeNumberOrNotUsingSquareRoot(int n) {
        if(n<=1){
            return false;
        }
        int diviserCount = 0;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }

    public static void checkNumberIsPrime(int n){
        int counter =0;
        for(int i =1; i<=n;i++) {
            if (n % i == 0) {
                //counter++;
            System.out.println(i);
            }
        }
            if(counter==2){
                System.out.println(n + " Its a prime Number ");
            }else
                {
                    System.out.println(n + " is NOT a Prime Number.");
                }
            }

            /*
            ✅ Modify the program to print all prime numbers from 1 to n.
             */

    public static void printAllTheNumberFrom1ToN(int n){
            for(int i=1;i<n; i++){
                if(checkNumberIsPrimeNumberOrNot(i)){
                    System.out.println(i +" ");
                }

            }
    }

    /*
    ✅ Try modifying the program to also count how many prime numbers are found from 1 to n.
    Hint: Use a counter variable inside printAllPrimeNumbers(n).
     */

    public static void CountAllTheNumberFrom1ToN(int n){
        int count=0;
        for(int i=1;i<n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.println(i +" ");
                count++;
            }
        }
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*
    ✅ Modify the program to display the sum of all prime numbers found from 1 to n.
Hint: Use a variable (sum) inside the loop to keep adding prime numbers.
     */

    public static void SumOfAllTheNumberFrom1ToN(int n){
        int sum=0;

        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                sum +=i;

            }

        }
        System.out.println("Total Sum of Prime numbers are " + sum + " found for 1 to " + n);
    }

    /*
    ✅ Modify the program to find the average of all prime numbers from 1 to n.
Hint: Use sum / count (both should be double to get an accurate result).
     */
    public static void averageOfAllTheNumberFrom1ToN(int n){
        int sum=0;
        int count=0;
        double average=0;

        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                sum +=i;
            }

        }
        if(count == 0){
            System.out.println("There are no Prime Numbers");
            return;
        }
        average = (double)sum/count;
        System.out.println("Total Sum of Prime numbers are " + sum + " found for 1 to " + n);
        System.out.println("The average of all the number from 1 to "+ n +" is : "+ average);
    }
/*
✅ Modify the program to find the largest prime number from 1 to n.
Hint: Use a variable to keep track of the largest prime found so far.
 */

    public static void findTheLargestPrimeNumberFrom1ToN(int n){
        int count=0;
        int largestPrimeNumber =0;
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(largestPrimeNumber<i){
                    largestPrimeNumber=i;
                }

            }
        }
        System.out.println();
        System.out.println("The Largest Prime Number is " + largestPrimeNumber);
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*
    ✅ Modify the program to find the smallest prime number from 1 to n (excluding 1).
Hint: Use a variable to store the smallest prime and update it when a prime is found.
     */
    public static void findTheSmallestPrimeNumberFrom1ToN(int n){
        int count=0;
        int smallestPrimeNumber =Integer.MAX_VALUE;
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(smallestPrimeNumber>i){
                    smallestPrimeNumber=i;
                }

            }
        }
        System.out.println();
        if (smallestPrimeNumber == Integer.MAX_VALUE) {
            System.out.println("No Prime Numbers found in range 1 to " + n);
        } else {
            System.out.println("The Smallest Prime Number is: " + smallestPrimeNumber);
        }
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*
    ✅ Modify the program to find the second smallest prime number from 1 to n.
Hint: Use two variables: smallestPrime and secondSmallestPrime.
     */

    public static void findTheSecondSmallestPrimeNumberFrom1ToN(int n){
        int count=0;
        int smallestPrimeNumber =Integer.MAX_VALUE;
        int secondSmallestNumber= Integer.MAX_VALUE;
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(i<smallestPrimeNumber){
                    secondSmallestNumber=smallestPrimeNumber;
                    smallestPrimeNumber = i;
                }else if (i > smallestPrimeNumber && i < secondSmallestNumber) {
                    secondSmallestNumber = i;
                }

                }
        }
        System.out.println();
        if (count < 2) {
            System.out.println("There is no second smallest prime number.");
            return;
        }
        System.out.println("The Second Smallest Prime Number is: " + secondSmallestNumber);
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*
    ✅ Modify the program to find the second largest prime number from 1 to n.
Hint: Track both largestPrime and secondLargestPrime.
     */

    public static void findTheSecondLargestPrimeNumberFrom1ToN(int n){
        int count=0;
        int largestPrimeNumber =Integer.MIN_VALUE;
        int secondLargestPrimeNumber=Integer.MIN_VALUE;
        System.out.println("Prime numbers from 1 to " + n + " are:");
        for(int i=1;i<=n; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(i>largestPrimeNumber){
                    secondLargestPrimeNumber = largestPrimeNumber;
                    largestPrimeNumber=i;
                }else if (i  <largestPrimeNumber && i > secondLargestPrimeNumber) {
                    secondLargestPrimeNumber = i;
                }


            }
        }
        if(count<2){
            System.out.println("There is no second largest prime number.");
            return;
        }
        System.out.println();
        System.out.println("The First Largest Prime Number is " + largestPrimeNumber);
        System.out.println("The Second Largest Prime Number is " + secondLargestPrimeNumber);
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*
    ✅ Modify the program to find the sum of all prime numbers between two given numbers (a and b).
    Hint: Use a loop to sum all primes in the range [a, b].
     */
    public static void findTheSumOfAllThePrimeNumbersBetweenTwoGivenNumbers(int n, int m){
        int count=0;
        int sum=0;
        int largestPrimeNumber =Integer.MIN_VALUE;
        int secondLargestPrimeNumber=Integer.MIN_VALUE;
        System.out.println("Prime numbers from " + n+ "  to " + m + " are:");
        for(int i=n;i<=m; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(i>largestPrimeNumber){
                    secondLargestPrimeNumber = largestPrimeNumber;
                    largestPrimeNumber=i;
                }else if (i  <largestPrimeNumber && i > secondLargestPrimeNumber) {
                    secondLargestPrimeNumber = i;
                }

             sum +=i;
            }
        }
        if(count<2){
            System.out.println("There is no second largest prime number.");
            return;
        }
        System.out.println("Total Sum is " + sum);
        System.out.println();
        System.out.println("The First Largest Prime Number is " + largestPrimeNumber);
        System.out.println("The Second Largest Prime Number is " + secondLargestPrimeNumber);
        System.out.println("Total " + count + " number of prime numbers are found for 1 to " + n);
    }

    /*

    ✅ Modify the program to find the product (multiplication) of all prime numbers between two given numbers (n and m).
Hint: Use long to store the product (product *= i).
     */
    public static void findTheMultiplicationOfAllThePrimeNumbersBetweenTwoGivenNumbers(int n, int m){
        int count=0;
        long product=1;
        int largestPrimeNumber =Integer.MIN_VALUE;
        int secondLargestPrimeNumber=Integer.MIN_VALUE;
        System.out.println("Prime numbers from " + n+ "  to " + m + " are:");
        for(int i=n;i<=m; i++){
            if(checkNumberIsPrimeNumberOrNot(i)){
                System.out.print(i +" ");
                count++;
                if(i>largestPrimeNumber){
                    secondLargestPrimeNumber = largestPrimeNumber;
                    largestPrimeNumber=i;
                }else if (i  <largestPrimeNumber && i > secondLargestPrimeNumber) {
                    secondLargestPrimeNumber = i;
                }

                product *=i;
            }
        }
        System.out.println();
        if(count==0){
            System.out.println("No prime Numbers found in the given " + n + " to " + m + " range");
            return;
        }else if(count==1){
            System.out.println("Only 1 prime Number Found between " + n + " to " + m + " range");
        }
        if(count<2){
            System.out.println("There is no second largest prime number.");
            return;
        }
        System.out.println("Total Multiplication is " + product);
        System.out.println();
        System.out.println("The First Largest Prime Number is " + largestPrimeNumber);
        System.out.println("The Second Largest Prime Number is " + secondLargestPrimeNumber);
        System.out.println("Total " + count + " number of prime numbers are found for "+ n + " to " + m);
    }

/*
✅ Modify the program to find the difference (subtraction) between the largest and smallest prime number in the given range (n to m).
Hint: Store smallestPrime and largestPrime, then subtract.
 */
public static void findTheDifferenceBetweenTheLargestAndSmallestPrimeNumbersBetweenTwoGivenNumbers(int n, int m) {
    int count = 0;
    int largestPrimeNumber = Integer.MIN_VALUE;
    int smallestPrimeNumber=Integer.MAX_VALUE;
    System.out.println("Printing the difference of largest  " + n + "  to " + m + " are:");
    for (int i = n; i <= m; i++) {
        if (checkNumberIsPrimeNumberOrNot(i)) {
            System.out.print(i + " ");
            count++;
            if (i > largestPrimeNumber)
                largestPrimeNumber = i;
            if (i < smallestPrimeNumber) {
                smallestPrimeNumber = i;
            }
        }
    }
    System.out.println("Total " +count+ " number of prime numbers are found for " + n + " to " + m);
    int difference =largestPrimeNumber-smallestPrimeNumber;

System.out.println("The Largest Prime Number is " + largestPrimeNumber);
System.out.println("The Smallest Prime Number is " + smallestPrimeNumber);
System.out.println("The Difference of the Largest and Smallest Prime number from " +n + " to " + m + " is :"+ difference );
    System.out.println();

}

/*
✅ Modify the program to count how many prime numbers are even and how many are odd between n and m.
Hint: Use two counters: evenCount and oddCount.
 */
public static void countTheNumberOfEvenAndOddInGivenPrimeNumbersBetweenTwoGivenNumbers(int n, int m) {
    int count = 0;
    int evenCount= 0;
    int oddCount=0;
    for (int i = n; i <= m; i++) {
        if (checkNumberIsPrimeNumberOrNot(i)) {
            System.out.print(i + " ");
            if(i%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            count++;
        }
    }
    if(count==0){
        System.out.println("No prime numbers found in the given Range");
        return;
    }
    System.out.println("Total " +count+ " number of prime numbers are found for " + n + " to " + m);
    System.out.println("The Total Number Of Even Primes: "+ evenCount + " | Odd Primes: "+ oddCount);
}
/*
✅ Modify the program to check if the sum of all prime numbers between n and m is also a prime number.
Hint: Use a variable sum, then check if sum itself is prime.

 */
    public static void programToCheckIfTheSumOfAllPrimeNumbersBetweenMAndNIsAlsoAPrimeNumber(int m, int n) {
        int count = 0;
        int sum = 0;
        System.out.println("Prime numbers from " + m + " to " + n + " are:");
        for (int i = m; i <= n; i++) {
            if (checkNumberIsPrimeNumberOrNot(i)) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println();
        if(count==0){
            System.out.println("No Prime numbers in found in the given Range. ");
            return;
        }
        System.out.println("Total Sum of Prime Numbers: " + sum);
        System.out.println("Checking if " + sum +" is Prime Number : " + checkNumberIsPrimeNumberOrNot(sum));
    }

    /*
    ✅ Modify the program to check if the product of all prime numbers between m and n is also a prime number.
Hint: Use a long variable product, then check if product itself is prime.
     */

    public static void checkIfTheProductOfAllPrimeNumbersBetweenMAndNIsAlsoAPrimeNumber(int m, int n){
        int count=0;
        long product =1;
        for(int i =m; i <= n; i++){
            if(m%i==0){
                System.out.print(i + " ");
                count++;
            }
            //product *= i;
        }
        //System.out.println("The Total Product of Prime Numbers are " + product);
        if(count==2){
            System.out.println("Its a Prime Number ");
        }else{
            System.out.println("Its not a Prime Number");
        }



        int count1=0;
        for(int i =1; i<product;i++) {
            if (product%i==0){
                count1++;
            }
        }
        if(count1==2){
            System.out.println("Its a Prime Number");
        }else{
            System.out.println("Its not a Prime Number");
        }

    }

    private static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2; i*i<=num; i++){
            if(num%i==0){
               return false;
            }
        }
        return true;
    }

    private static boolean IsPrimeOrNot(int num){
        if(num<=1){
            return false;
        }
        if(num ==2){
            return true;
        }

        for(int i =3;i*i<=num; i++){
            return false;
        }
        return true;
    }

public static int findSmallestPrimeFactor(long num){
        if(num<=1){
            return -1;
        }
        for(int i =2;i<Math.sqrt(num);i++){
            if(num%i==0 && IsPrimeOrNot(i)){
                return i;
            }
        }
         return (int)num;
}

    public static int findLargestPrimeFactor(long num){

        long largest = -1;
        if(num<=1){
            return -1;
        }
        for(int i =2;i<num;i++){
            if(num%i==0 && IsPrimeOrNot(i)){

                if(i>largest){
                    largest=i;
                    return i;
                }
            }
        }

        return (int)num;
    }
    /*
    ✅ Modify the program to find the smallest prime factor of the product of all prime numbers between m and n.
Hint: Start from 2 and find the first factor of product that is prime.
     */
public static void findTheSmallestPrimeFactorOfTheProductOfAllPrimeNumbersBetweenMAndN(int m, int n){
long product =1;
int count =0;

    System.out.println("Prime numbers from " + m + " to " + n + " are:");

    for(int i =m; i<=n; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
            count++;
            product *= i;
        }
    }
    System.out.println();
    if (count==0){
        System.out.println("There are no Prime Number");
        return;
    }
    System.out.println("The Total Product of Prime Numbers is: " + product);
    int smallestPrimeFactor = findSmallestPrimeFactor(product);
    System.out.println("The Smallest Prime Factor of the Product (" + product + ") is: " + smallestPrimeFactor);
}

/*
✅ Modify the program to find the largest prime factor of the product of all prime numbers between m and n.
Hint: Instead of stopping at the first prime factor, continue checking for the largest one.
 */
public static void findTheLargestPrimeFactorOfTheProductOfAllPrimeNumbersBetweenMAndN(int m, int n){
    long product =1;
    int count =0;

    System.out.println("Prime numbers from " + m + " to " + n + " are:");

    for(int i =m; i<=n; i++){
        if(isPrime(i)){
            System.out.print(i + " ");
            count++;
            product *= i;
        }
    }
    System.out.println();
    if (count==0){
        System.out.println("There are no Prime Number");
        return;
    }
    System.out.println("The Total Product of Prime Numbers is: " + product);
    int smallestPrimeFactor = findSmallestPrimeFactor(product);
    System.out.println("The Smallest Prime Factor of the Product (" + product + ") is: " + smallestPrimeFactor);
}



}
