package concepts;

public class Loops {

    public static void main(String[] args) {
        System.out.println("For Loop Output:");
        loop(10);

        System.out.println("While Loop Output:");
        doLoop(10);

        System.out.println("Do-While Loop Output:");
        doWhileLoop(10);
    }

    static void loop(int n){
        for(int i=0;i<=n;i++)
            System.out.print(i+ " ");
        System.out.println();
    }

    static void doLoop(int n) {
       int i=0;
        while(i<=n){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
    }
    static void doWhileLoop(int n){
       int  i=0;
    do {
        System.out.print(i+ " ");
        i++;

    }
        while (i <= n) ;
    }


}
