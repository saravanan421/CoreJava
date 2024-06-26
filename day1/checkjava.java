import java.util.Scanner;

public class checkjava {
public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int difference;
        if (number > 50) {
            int digit1 = number / 10;
            int digit2 = number % 10;
            difference = Math.abs(digit1 - digit2);
        } else {
            int reversedNumber = reverseNumber(number);
            int digit1 = reversedNumber / 10;
            int digit2 = reversedNumber % 10;
            difference = Math.abs(digit1 - digit2);
        }
        
        System.out.println("The difference between the digits is: " + difference);
    }
    
    
}