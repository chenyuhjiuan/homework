import java.util.Scanner;

public class AveragetwoNum
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();

        System.out.println("The average value is : " +(num1+num2)/2);
    }
}