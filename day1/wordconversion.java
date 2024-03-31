import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
class Wordconversion{
public static void main(String[] args){
 Dictionary<Character,String> dict=new Hashtable<>();
 dict.put('0',"zero");
 dict.put('1',"one");
 dict.put('2',"two");
 dict.put('3',"three");
 dict.put('4',"four");
 dict.put('5',"five");
 dict.put('6',"six");
 dict.put('7',"seven");
 dict.put('8',"eight");
  dict.put('9',"nine");
  System.out.println(dict);
String out="";
Scanner inpt=new Scanner(System.in);
 String value=inpt.nextLine();

 for(int i=0;i<value.length();i++){
	 char val=value.charAt(i);
	  System.out.print(dict.get(val)+" ");
 }
 
}

}