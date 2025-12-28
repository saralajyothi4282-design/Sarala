import java.util.Scanner;

class Calculator
  {
    double add(double a, double b)
    {
        return a + b;
    }

    double subtract(double a, double b)
    {
        return a - b;
    }

    double multiply(double a, double b) 
    {
        return a * b;
    }

    double divide(double a, double b)
    {
        if (b == 0)
        {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return a / b;
    }
}

public class Problem1
  {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next();

        switch (operation) 
        {
            case "add":
                System.out.println(calc.add(a, b));
                break;
            case "subtract":
                System.out.println(calc.subtract(a, b));
                break;
            case "multiply":
                System.out.println(calc.multiply(a, b));
                break;
            case "divide":
                System.out.println(calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}
