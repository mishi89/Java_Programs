package Java_Programs;

public class Word_String_Reverse {

	public static void main(String[] args) {

        String s1="My Name is Himanshu";
        char ch[]=s1.toCharArray();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+ch[i];
        }
        String s3[]=s2.split(" ");
        String s4="";
        for(int j=s3.length-1;j>=0;j--){
            s4=s4+s3[j]+" ";
        }
        System.out.print(s4);
    }


}
