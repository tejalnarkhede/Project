import java.util.Scanner;
public class TestAssertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		int amt=sc.nextInt();
		System.out.println("Amount="+amt);
		assert(amt>1000):"Balance is less than 1000";
		System.out.println("Thank you..");
	}

}
