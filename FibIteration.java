public class FibIteration implements FindFib
{
    public int calculate_fib(int integer)
    {
        if(integer == 1 || integer == 2)
        {
            return 1;
        }
        else
        {
            int fibonacciOne = 0;
            int fibonacciTwo = 1;
            int output = 0;

            for (int i = 1; i < integer; i++)
            {
                output  = fibonacciTwo + fibonacciOne;
                fibonacciOne = fibonacciTwo;
                fibonacciTwo = output;
            }

            return output;
        }

    }
}
