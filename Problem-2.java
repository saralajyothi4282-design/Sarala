import java.util.ArrayList;
import java.util.List;

public class OddSeries1 
{

    public static List<Integer> generateOddNumbers(int a)
    {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= a; i++)
            {
            oddNumbers.add(2 * i - 1);
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println("Input a = " + a + ", Output: " + generateOddNumbers(a));
    }
}
