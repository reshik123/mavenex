package res.mavenex;



import java.util.Scanner;

public class App
{
    public boolean checkEvenOdd(int n)
    {
        return n % 2 == 0;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if(n % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}