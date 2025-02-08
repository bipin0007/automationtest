package concepts;

public class EvenNumbersUsingALoop {

    public static void main(String[] args) {
        System.out.println("Even Numbers using For Loop:");
        printEvenNumber(20);
        System.out.println("Even Numbers using While Loop:");
        printUsingWhileEvenNumber(10);
        System.out.println("Odd Numbers using While Loop:");
        printUsingWhileOddNumber(20);
        System.out.println("Even Numbers using Do-While Loop:");
        printUsingDoWhileEvenNumber(20);
    }

    public static void printEvenNumber(int n){
        for(int i =0;i<=n;i++){
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printUsingWhileEvenNumber(int n){
        int i=0;
        while(i<=n){
            if(i%2==0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void printUsingWhileOddNumber(int n){
        int i=0;
        while(i<=n){
            if(i%2!=0){
                System.out.print(i+ " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void printUsingDoWhileEvenNumber(int n){

        int i=0;
        do{
            if(i%2==0){
                System.out.print(i+ " ");
            }
            i++;
        }while(i<=n);
        System.out.println();
    }


}
