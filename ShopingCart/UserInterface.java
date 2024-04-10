package Com.ShopingCart;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("""
                options
                1. add product.
                2. display.
                3. exit""");
        Product pro=new Product();
        Scanner obj=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);
        boolean trigger =true;
        while (trigger){
            System.out.print("select options : ");
            int val=obj.nextInt();
            switch (val){

                case 1:{
                    System.out.println("you have clicked add products!!");
                    String prod=obj2.nextLine();
                    pro.addProductToList(prod);
                    break;
                }
                case 2:{
                    System.out.println("you clicked  display product!!");
                    List<String> che=pro.getProductList();
                    if (che.size()==0){
                        System.out.println("this set is empty!!");
                    }
                    else {
                        pro.sortProductList();
                        System.out.println( che.toString());
                    }
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
