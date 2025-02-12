import javax.swing.*;
import java.util.Scanner;
abstract class prim {
    int n=20;
    void calcu()
    {
        int i=0;
        while (i<=n)
        {
            if (n%i==0)
                System.out.println(i);
            i++;
        }
    }
}
class pri extends prim{
    int a;
}

public class Demo {

    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JButton resetButton;

    public static void main(String arg[]){

        Scanner s=new Scanner(System.in);
        System.out.println();
        pri a=new pri();
        a.calcu();


    }
}
