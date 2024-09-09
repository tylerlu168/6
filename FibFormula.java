public class FibFormula implements FindFib
{
    public int calculate_fib(int integer)
    {
        int output = (int) ((((Math.pow((1 + Math.sqrt(5))/2, integer))) - ((Math.pow((1 - Math.sqrt(5))/2, integer)))) / Math.sqrt(5));
        //int output2 = (int) ((Math.pow((1 - Math.sqrt(5))/2, integer)) / Math.sqrt(5));
        return output;
    }
}
