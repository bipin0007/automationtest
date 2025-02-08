package concepts;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        System.out.println("Printing Numbers in Reverse order");
        printNumbersInReverseOrder(20);

        System.out.println("Printing Addition of Natural Number");
        System.out.println(printSumOfNaturalNumber(10));

        System.out.println("Printing Addition of Natural Number Using Maths concept");
        System.out.println(printSumOfNaturalNumberUsingMathsFormula(15));
    }

    public static void printNumbersInReverseOrder(int n){
        for(int i =n;i>=0;i--){
            System.out.print(i);
        }
        System.out.println();
    }

    public static int printSumOfNaturalNumber(int n){
        int sum=0;
        int i =1;
        while(i<=n){
            sum +=i;
            i++;
        }
        return sum;
    }

    public static int printSumOfNaturalNumberUsingMathsFormula(int n){
     int sum = n*(n+1)/2;
     return sum;
    }


}
