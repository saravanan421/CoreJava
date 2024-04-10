package Com.ApplicaitonTreeset;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;
public class NumAvg {
   private  TreeSet<Integer> numbers=new TreeSet<>();
   private int count=0;
    public TreeSet<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(TreeSet<Integer> numbers) {
        this.numbers = numbers;
    }
    public void addNum(int num){
        if(num%5!=0 && num%6!=0){
            count+=1;
        }
        numbers.add(num);
    }
    public double calAvg(){
        if (this.numbers.isEmpty()) {
        return 0.0;

        }
        return (double) numbers.stream().filter((a)->a%5!=0 && a%6!=0).mapToInt(Integer ::intValue).sum()/count;
    }
}
