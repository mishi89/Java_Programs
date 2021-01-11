package Java_Programs;

public class Remove_Duplicate_String {

	public static void main(String[] args) {
		String s1="AAB CCD EE EMKK";
		String s2=s1.replaceAll("\\s", "");
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(i)==s2.charAt(j))
				{
					count=count+1;
				}			
			}

			if(count>1) 
			{
				System.out.println(s2.charAt(i)+" "+count); // Will print value of repeated character
				String temp=String.valueOf(s2.charAt(i));	// Storing that character in string
				s2=s2.replaceAll(temp,"");					// Removing removing that character from current string 
				count = 0;
			}
		}


			}
					
		
	

	}


