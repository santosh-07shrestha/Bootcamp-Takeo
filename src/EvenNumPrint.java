
public class EvenNumPrint {
	public static void EvenNumPrintFun() {
		System.out.println("Even numbers from 1 to 100 are: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + ", ");
		}
	}

	public static void PrimeNumFun() {
		System.out.println("Prime Numbers from 1 to 100 are: ");
		for (int i = 2; i <= 100; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
				System.out.print(i + ", ");
		}
	}
}
