import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EvenNumPrint.EvenNumPrintFun();
		EvenNumPrint.PrimeNumFun();
		System.out.println("Enter a number to check odd or even: ");
		OddEven.OddEvenFun(scan.nextInt());
		System.out.println("Enter a year to check leap year or not: ");
		boolean flag = LeapYearCheck.LeapYear(scan.nextInt());
		System.out.println(flag + " leap year");
	}

}
