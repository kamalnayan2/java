import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class add{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    void cal(int n){
        int f=0;
        for (int i = 2; i <n; i++) {
            f=0;
            if(n%i==0) {
                f = 1;
                break;
            }
        }
        if (f==0 && n!=1)
            System.out.println(n);
    }
}

public class PrimeNo {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       add pr=new add();
       int n= arg.length;
       int a[]=new  int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(arg[i]);
            pr.cal(a[i]);
        }
    }
}
