import java.util.ArrayList;
import java.util.List;

public class OddSeries2 {

    public static List<Integer> generateConditionalOddSeries(int a) {
        List<Integer> oddNumbers = new ArrayList<>();
        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= limit; i += 2) {
            oddNumbers.add(i);
        }
        return oddNumbers;
    }

    public static void main(String[] args) {
        int a = 6;
        System.out.println("Input a = " + a + ", Output: " + generateConditionalOddSeries(a));
    }
}
