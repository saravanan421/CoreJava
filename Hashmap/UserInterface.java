package Com.Hashmap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("""
                1.Add
                2.Search
                3.Exit"""

        );
        Country game = new Country();
        Scanner obj=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);
        boolean trigger=true;
        while (trigger) {
            System.out.print("enter your options : ");
            int option=obj2.nextInt();
           switch (option){
               case 1:{System.out.print("enter the country name and capital names : ");
                   String[] key = obj.nextLine().trim().split(" ");
                   game.add(key[0],key[1]);
                    break;
               }
               case 2:{
                   System.out.print("enter the capital name that your want to find : ");
                    String searchname=obj.nextLine();
                    System.out.println(game.search(searchname));
                    break;
               }
               case 3:{
                   trigger=false;
                   System.out.println("thank you for using this application!!");
                   break;
               }
           }
        }
    }
}
