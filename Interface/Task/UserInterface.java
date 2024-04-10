package Com.Interface.Task;
import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
            System.out.println("Enter the customer name : ");
            String name=obj.nextLine();
            System.out.println("Enter the customer phone number : ");
            String phnum=obj.nextLine();
            System.out.println("Enter the street name : ");
            String stname=obj.nextLine();
            System.out.println("Enter bill Amount : ");
            double amount=obj.nextDouble();
            System.out.println("Enter the distance : ");
            int dist=obj.nextInt();
            CustomerDetials c1=new CustomerDetials(name,phnum,stname,amount,dist);
            System.out.println(c1.toString());
    }
}
