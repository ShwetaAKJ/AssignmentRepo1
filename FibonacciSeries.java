public class FibonacciSeries {
    public static void main(String[] args) {

        FibonacciSeries fibo=new FibonacciSeries();
        fibo.fibonacci();
    }

    void fibonacci()
    {
        int i=0,j=1,c;
        System.out.println(i+" ");
        System.out.println(" "+j);
        do
        {
            c=i+j;
            System.out.println(" "+c);
            i=j;
            j=c;

        }while(c<=34);

    }
}
