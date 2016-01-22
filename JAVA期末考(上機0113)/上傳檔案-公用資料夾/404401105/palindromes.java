import java.io.*;

public class palindromes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String preset = "AbC dEf G fEd CbA";
		System.out.print("請輸入一個單字:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		br.close();
		if(line==null||line.trim().length()==0)
			line = preset;
		int length = line.length();
		if(length%2==0)
			System.out.println("not palindrome");
		else
		{
			String s1 = line.substring(0,length/2-1);
			String s2 = line.substring(0,length/2+2);
			char[]chars = s2.toCharArray();
			char[]chars2 = new char[chars.length];
			for(int i = 0 ; i < chars.length ; i++)
				chars2[i]=chars[chars.length-i-1];
			String s3 = new String(chars2);
			if(s1.equals(s3))
				System.out.println("是迴文");
			else
				System.out.println("不是迴文");
		}

	}

}
