package Java_Programs;

public class Palindrome {

	public static void main(String[] args) {
		int number=121, temp,sum=0;

		temp =number;
		while(number>0)
		{
		int r = number%10;
		 sum = sum+10*r;
		 number=number/10;
		 
		
		}
		

	}

}
