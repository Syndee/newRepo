import java.util.Scanner;
public class Expression{

	public static void main(String... arg) {
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter salary amount: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter pocket money: ");
		int secondNumber = input.nextInt();

		if(firstNumber < secondNumber) {
		System.out.print("Second number is greater");
		}
		
		if(firstNumber > secondNumber) {
		System.out.print("First number is greater");
		}




	}
}