import javax.swing.*;
import java.awt.*;

class frameAdd extends Frame
{
    Label l1,l2;
    Button Sum;
    TextField nu1,nu2;

    frameAdd(){
        setVisible(true);
        setSize(200,300);
        setTitle("addition of two no");
        setLayout(new FlowLayout());

        l1=new Label("enter the num1");
        l2=new Label("Enetr the num2");
        nu1=new TextField();
        nu2=new TextField();
        Sum=new Button("Add");
        add(l1);
        add(nu1);
        add(l2);
        add(nu2);
        add(Sum);
    }

}
public class DemoFrameAdd {
    public static void main(String arg[])
    {
        frameAdd f=new frameAdd();
    }
}
