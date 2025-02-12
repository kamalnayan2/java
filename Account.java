import java.io.BufferedReader;
import java.io.InputStreamReader;

abstract class order{
    int id;
    String desc;
}
class Pure extends order{
    String customerName;
    void read()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the Customer ID");
            id=Integer.parseInt(br.readLine());
            System.out.println("Enter the Customer name");
            customerName= br.readLine();
            System.out.println("Enter the description ");
            desc=br.readLine();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    void display(){
       System.out.println(id+"\t"+customerName+"\t"+desc);
    }
}
class sel extends order{
    String VendName;
    void read()
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the Customer ID");
            id=Integer.parseInt(br.readLine());
            System.out.println("Enter the Vender name");
            VendName=br.readLine();
            System.out.println("Enter the description ");
            desc=br.readLine();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    void display(){
        System.out.println(id+"\t"+VendName+"\t"+desc);
    }
}
public class Account {
    public static void main(String arg[])
    {
        sel a[]=new sel[3];
        Pure b[]=new Pure[3];
        for (int i = 0; i < 3; i++) {
            a[i]=new sel();
            b[i]=new Pure();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the purches details of "+i+"\n");
            b[i].read();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("enter the seal details of "+i+"\n");
            a[i].read();
        }

        System.out.println("purches details is");
        System.out.println("id\tcustomerName\tdesc");
        for (int i = 0; i < 3; i++) {
            b[i].display();
        }
        System.out.println("seals details is");
        System.out.println("id\tVendName\tdesc");
        for (int i = 0; i < 3; i++) {
            a[i].display();
        }
    }
}
