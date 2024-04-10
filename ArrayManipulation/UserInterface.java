package Com.ArrayManipulation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static String getDuplicateElement (Integer number){

        return ""+number;
    }

    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
            Scanner obj = new Scanner(System.in);
            System.out.print("enter the size of the array!!!!");
            int arraysize = obj.nextInt();
            for (int i = 0; i < arraysize; i++) {
                System.out.print("enter the number to add!!");
                int val = obj.nextInt();
                list.add(val);
            }
            String out = "";
            for (int vals : list) {
                out = out + vals + ",";
            }
            System.out.print("enter the position to replicate");
            int val = obj.nextInt();
            System.out.println("the array elements are : " + out + getDuplicateElement(val));

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Array index is out of range");
        }catch (InputMismatchException e){
            System.out.println("Input was not in the correct format");
        }catch (NegativeArraySizeException e){
            System.out.println("Array size should be positive");
        }
    }
    }
