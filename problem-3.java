import java.util.Scanner;

public class Problem3
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

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= limit * 2; i += 2)
          {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
