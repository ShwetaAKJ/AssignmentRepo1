import java.util.Scanner;
public class ScannerAssignment {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= scan.nextInt();

        System.out.println("square of the number is:"+(num*num));
        System.out.println("cube of this number:"+(num*num*num));
        System.out.println("fourth power of this number:"+(num*num*num*num));


    }
}
