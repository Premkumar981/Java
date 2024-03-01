public class Explicit_Conversion {
    public static void main(String[] args) {
		int i = (int)18.99f;
		System.out.println("int value = " + i);
		float f = i;
		System.out.println("after float widening : " + f);
		int big = 1234567890;
		float approx = big;
		System.out.println("The lose value = " + (big - (int)approx));
	}
}
