public class Implicit_Conversion {
    public static void main(String[] args) {
		int i = 20, intsum;
		char ch = 'a';
		float floatsum;
		intsum = i + ch;
		floatsum = i + ch;
		System.out.println("Integer result = " + intsum + " Float result = " + floatsum);
	}
}
