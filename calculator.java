import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double x = input.nextDouble();
        System.out.println();

        System.out.print("Please enter an operator: +, -, *, /, or ^: ");
        char operator = input.next().charAt(0);
        System.out.println();

        System.out.print("Please enter a number: ");
        double y = input.nextDouble();
        System.out.println();

        if(operator == '+')
        {
            System.out.println("The sum of "+x+" and "+y+" is: "+add(x, y));
        }

        if(operator == '-')
        {
            System.out.println("The subtraction of "+x+" and "+y+" is: "+sub(x, y));
        }

        if(operator == '*')
        {
            System.out.println("The product of "+x+" and "+y+" is: "+multiply(x, y));
        }

        if(operator == '/')
        {
            System.out.println("The division of "+x+" by "+y+" is: "+div(x, y));
        }

        if(operator == '^')
        {
            System.out.println("The power of "+x+" raised to the power of "+y+" is: "+pow(x, y));
        }


        input.close();
    }

    public static double add(double x, double y)
    {
        return x + y;
    }

    public static double sub(double x, double y)
    {
        return x - y;
    }

    public static double multiply(double x, double y)
    {
        return x * y;
    }

    public static double div(double x, double y)
    {
        return x / y;
    }

    public static double pow(double x, double y)
    {
        return Math.pow(x, y);
    }
    
}
