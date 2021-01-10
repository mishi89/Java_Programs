package Java_Programs;

public class String_Reverse {

	public static void main(String[] args) {
		String str = new String("My name is himanshu ");
		char[] chr = str.toCharArray();

		int l = str.length();
		String temp = "";
		for (int i = l - 1; i >= 0; i--) {
			temp = temp + chr[i];
		}
		System.out.println(temp);

	}

}
