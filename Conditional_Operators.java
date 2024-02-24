public class Conditional_Operators {
    public static void main(String[] args) {
		boolean noWorkInOffice = true;
		boolean isTodaySunday = false;
		boolean canTakeLeave = true;
		if (isTodaySunday || (noWorkInOffice && canTakeLeave)) {
			System.out.println("I am fishing...");
		}
	}
}
