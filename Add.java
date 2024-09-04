import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
//Scanner class has function next(),nextInt(),nextFloat();
class AddDemo
{
	int Num1,Num2,Sum;
	/*void ReadData()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Two Number: ");
		Num1=sc.nextInt();
		Num2=sc.nextInt();
		Cal();
	}	*/
	void ReadData()
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the Two Number");
			Num1=Integer.parseInt(br.readLine());
			Num2=Integer.parseInt(br.readLine());
			Cal();

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void Display()
	{
		System.out.println("The addition Of Num1="+Num1+" and Num2="+Num2+" Sum="+Sum);
		
	}
	void Cal()
	{
		Sum=Num1+Num2;
	}
}
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDemo add=new AddDemo();
		add.ReadData();
		add.Display();
	}

}
