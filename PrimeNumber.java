public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber prm=new PrimeNumber();
        prm.primeNum();
    }

    void primeNum()
    {
        int i,j;
        System.out.println("prime numbers are:");

        for( i=2;i<=20;i++)
        {
            int count=0;
            for( j=2; j<=i; j++)
            {
                if (i%j == 0) {
                    count++;
                }

            }
            if(count==1)
            {
                System.out.println(i+" is prime");
            }

        }


    }
}
