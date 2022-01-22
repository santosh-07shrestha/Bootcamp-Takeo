
public class LeapYearCheck {
	public static boolean LeapYear(int year) {
		boolean flag = false;
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			flag = true;
		}
		else
			flag = false;
		return flag;
	}

}
