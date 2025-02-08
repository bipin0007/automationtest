package concepts;

public class SwitchExample {

    public static void main(String[] args) {
        checkEvenAndOdd(-20);
    }

    public static void checkEvenAndOdd(int n) {

        switch(n%2){
            case 0:
                System.out.println("Its and Even Number");
break;
            case 1:
            case -1:
                System.out.println("Its and Odd Number");
                break;
        }



    }
}
