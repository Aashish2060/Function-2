public class products {
    public static int mul(int x, int y)
    {
        int products =x*y;
        return products;
    }
    public static int factorial(int b){
        int fact=1;
        for (int i=1;i<=b;i++)
        {
            fact*=i;

        }
        return fact;
//       System.out.println("factorial is"+fact);
    }
    public static int bincoff(int n, int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bincof= fact_n/(fact_r-fact_nmr);
        return bincof;
    }
    public static void main(String[] args)
    {
        int a=5;
        int b=9;
         int multiply=mul(a,b);

         System.out.println("product is:"+multiply);
       int factl= factorial(b);
        System.out.println("factorial is:"+factl);
        int binarycofficient=bincoff(b,a);
        System.out.println("Binary cofficient of bCa is :"+binarycofficient);



    }
}
