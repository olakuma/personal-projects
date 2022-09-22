public class christmasTree
{
    public static void main(String[] args)
    {
        drawTree(10);
    }

    public static void drawTree(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            // indentation
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            //stars
            for(int k = 1; k <= i*2-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}