package Com.ApplicaitonTreeset;
import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        System.out.println("""
                options
                1. add numbers
                2. average sum.
                3. exit""");
        NumAvg numbers=new NumAvg();
        Scanner obj=new Scanner(System.in);
        boolean trigger =true;
        while (trigger){
            System.out.print("select options : ");
            int val=obj.nextInt();
            switch (val){

                case 1:{
                    System.out.println("you clicked add number!!");
                int val1=obj.nextInt();
                numbers.addNum(val1);
                break;
            }
                case 2:{
                    System.out.println("you clicked find average!!");
                   double che=numbers.calAvg();
                   if (che==0.0){
                       System.out.println("this set is empty!!");
                   }
                    else System.out.println( numbers.calAvg());
                break;
                }
                case 3:{
                    System.out.println("Thank you for using the app!!");
                    trigger=false;
                }
            }

        }

    }
}
