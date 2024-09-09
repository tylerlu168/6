import java.util.Scanner;

 public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to find the Fibonacci Series for:");

        int enter = input.nextInt();

        FindFib iterationFib = new FibIteration();
        FindFib formulaFib = new FibFormula();

        int iterationAnswer = iterationFib.calculate_fib(enter);
        int formulaAnswer = formulaFib.calculate_fib(enter);

        System.out.println("Fib of " + enter + " by iteration is: " + iterationAnswer);

        System.out.println("Fib of " + enter + " by formula is: " + formulaAnswer);

    }

}
