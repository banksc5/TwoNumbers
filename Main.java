import java.util.Scanner;
public class Main
{
    public static int twoNumbers(int A, int B, int C)
    {
        int sum = A + B;
        int result = sum * C;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number");
        int A = in.nextInt();
        System.out.print("enter the second number");
        int B = in.nextInt();
        System.out.print("enter the third number");
        int C = in.nextInt();
        int list = twoNumbers(A,B,C);
        System.out.println("the answer is "+ list);
        in.close();

    }
}