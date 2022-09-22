import java.util.Scanner;

public class calculator1 {
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

        switch(operator)
        {
            // addition 
            case '+':
                System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
                break;

            case '-':
                System.out.println("The subtraction of "+x+" and "+y+" is "+(x-y));
                break;

            case '*':
                System.out.println("The product of "+x+" and "+y+" is "+(x*y));
                break;

            case '/':
                System.out.println("The division of "+x+" by "+y+" is "+(x/y));
                break;

            case '^':
                System.out.println("The power of "+x+" raised to the power of "+y+" is "+(Math.pow(x, y)));
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }
        input.close();
    }
}
