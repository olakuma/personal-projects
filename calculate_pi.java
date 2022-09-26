class calculate_pi
{
    public static void main(String[] args)
    {
        // int n = 10;
        System.out.println(solve_pi(1000000000));

    }

    public static double solve_pi(int n)
    {
        /* Using Leibniz formula for pi
         * 1 - (1/3) +(1/5) - (1/7) + (1/9) - ... = (pi/4)
         */

        double numerator = 4; // This is to get rid of the 4 in the denominator
        double denominator = 1;
        double operator = 1;
        double sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum += operator * numerator/denominator;
            operator *= -1;
            denominator += 2;
        }

        return sum;
    }
}