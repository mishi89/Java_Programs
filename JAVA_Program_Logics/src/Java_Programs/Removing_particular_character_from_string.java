package Java_Programs;

public class Removing_particular_character_from_string {

	public static void main(String[] args) {
		String s="My Name is Himanshu";
		char ch[]=s.toCharArray();
		String temp="";		
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a') {
			System.out.println("position of a "+ i);
			}				
			else
			{
			temp=temp+ch[i];
			}
		}
		System.out.println(temp);


	}

}
