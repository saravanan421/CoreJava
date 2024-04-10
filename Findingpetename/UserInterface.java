package Com.Findingpetename;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInterface{


    public static void main(String[] args) {
        String filename="D:\\javaprijectsTNSC2Ct\\CoreJava\\src\\Com\\Findingpetename\\petnames";
        findPetName(filename);
    }
    public static void findPetName(String filename){
    try {

        File f1 = new File(filename);
        if (!f1.exists()){
            throw new Exception("Please give the correct fi le name");
        }

        Scanner names = new Scanner(f1);
        while (names.hasNextLine()) {
            String petName = names.nextLine();
            Pattern regx = Pattern.compile("[aeiouAEIOU]");
            Matcher matcher = regx.matcher(petName);
            int count = 0;
            Boolean finded = false;
            while (matcher.find()) {
                count++;
                if (count > 1) {
                    System.out.println(petName);
                    finded = true;
                    break;
                }
            }
            if (finded == true) {
                break;
            }
        }
    } catch (IOException e) {
        System.out.println("Error occurred while reading the names from file");
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


    }
}
