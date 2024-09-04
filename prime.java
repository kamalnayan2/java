import jdk.dynalink.beans.StaticClass;

public class prime {
    int n=20;
            void calcu()
            {
                int i;
                while (i<=n)
                {
                    if (n%i==0)
                        System.out.println(i);
                    i++;
                }
            }
}

class PrimeDemo{
    public static void main(String a[])
    {
        prime a=new prime();
        a.calcu();
    }
}