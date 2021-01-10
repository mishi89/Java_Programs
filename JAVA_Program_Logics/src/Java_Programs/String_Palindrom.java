package Java_Programs;

public class String_Palindrom {

	public static void main(String[] args) {

		String orignal = new String("LOLi");
		String temp =orignal;

		int l = orignal.length();
		String rev = " ";
		System.out.println(l);
		for (int i = l - 1; i >= 0; i--) {
			String[] s1 = orignal.split(" ");
			rev = rev + orignal.charAt(i);
			
			

		}
		if(rev.equals(temp))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not");
		}


	}

}
