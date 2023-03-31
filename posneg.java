import java.util.*;
class posneg{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num >= 0){

            System.out.println("The number that you enter is positive number");
        }
        else{

            System.out.println("The number that you enter is Negative number");
        }
    }
}