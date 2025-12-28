public class Calculator 
{

    double a, b;
    String operation;

    public Calculator(double a, double b, String operation)
  {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() 
  {
        switch (operation) 
        {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) 
                {
                    System.out.println("Division by zero is not allowed");
                    return Double.NaN;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 5, "add");
        System.out.println("Addition: " + calc.calculate());

        calc = new Calculator(10, 5, "subtract");
        System.out.println("Subtraction: " + calc.calculate());

        calc = new Calculator(10, 5, "multiply");
        System.out.println("Multiplication: " + calc.calculate());

        calc = new Calculator(10, 0, "divide");
        System.out.println("Division: " + calc.calculate());
    }
}
