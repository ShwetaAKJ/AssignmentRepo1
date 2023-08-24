import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number to make it reverse");
        int num= scn.nextInt();

        ReverseNumber revnum=new ReverseNumber();
        System.out.println(revnum.reverse(num));
    }

    int reverse(int num)
    {
        int rem;
        int rev=0;
        do {
            rem= num % 10;
            rev=rev*10+rem;
            num=num/10;

        }while(num!=0);
        return rev;

    }
}
