
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=
			{
				{78,100},
				{59,80},
				{90,70},
				{65,120}
		    };
		System.out.println("     瓣ゅ   计厩");
		for(int i=0;i<4;i++){
			if(i==0)
				System.out.print("ヒ");
				if(i==1)
				System.out.print("");
				if(i==2)
				System.out.print("");
				if(i==3)
				System.out.print("");
			for(int j =0;j<2;j++){
				System.out.printf("%4d",arr[i][j]);
			}
			
			System.out.println();
		}
		int s = (90+70)/2;
		int s2=(78+59+90+65)/4;
		int s3=(78+100)/2;
		int s4=(59+80)/2;
		int s5=(65+120)/2;
		int s6=(s+s3+s4+s5)/4;
		System.out.println("キАだ计:"+s);
		System.out.println("瓣ゅキАだ计:"+s2);
		System.out.println("痁キАだ计:"+s6);
				
		
	}

}
