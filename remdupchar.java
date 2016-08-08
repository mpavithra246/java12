public class removeduchar {

	public static void main(String[] args) {
		String s="pavithra";
		StringBuffer s1=new StringBuffer(s);
		for(int i=0;i<s1.length();i++)
		{
		char ch=s1.charAt(i);	
		for(int j=i+1;j<s1.length();j++)
		{
			if(ch==s1.charAt(j))
			{
				s1.deleteCharAt(j);
			}
			
		}
		System.out.print(ch);
		}
	}

}
