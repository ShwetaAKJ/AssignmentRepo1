import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber arm=new ArmstrongNumber();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scn.nextInt();
        int sumcube=arm.findArmstrong(num);
        if(num==sumcube)
        {
            System.out.println(num +" is Armstrongnumber");
        }
        else {
            System.out.println(num +" is not Armstrongnumber");
        }

    }
    int findArmstrong(int num)
    {
        int cube=0;
        do{
            int rem=num%10;
           cube=cube+rem*rem*rem;
           num=num/10;

        }while(num!=0);
        return cube;
    }
}
