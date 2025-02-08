package concepts;

public class ConditionalStatements {

    public static void main(String[] args) {
        checkNumberIsPosOrNeg(-10);
    }

    public static void checkNumberIsPosOrNeg(int number){
        if(number==0){
            System.out.println("This number is Zero :" + number);
        }
        else if(number>0){
            System.out.println("This number is positive :" + number);
        }else{
            System.out.println("This number is Negative :" + number);
        }


    }

}
