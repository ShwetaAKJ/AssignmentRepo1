import java.util.Scanner;
public class ScannerAssignment {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= scan.nextInt();

        ScannerAssignment sc=new ScannerAssignment();

        System.out.println("square of the number is: "+sc.square(num));
        System.out.println("cube of this number:"+sc.cube(num));
        System.out.println("fourth power of this number:"+sc.fourthPow(num));
    }

    int square(int num)
    {
        return num*num;
    }
    int cube(int num)
    {
        return num*num*num;
    }

    int fourthPow(int num)
    {
        return num*num*num*num;
    }
}
