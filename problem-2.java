import java.util.Scanner;

public class Problem2 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <= 0) 
        {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= a; i++)
          {
            System.out.print((2 * i - 1) + " ");
        }

        sc.close();
    }
}
