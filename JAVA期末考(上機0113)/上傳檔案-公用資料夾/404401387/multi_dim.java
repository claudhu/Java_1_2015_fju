
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
		System.out.println("     國文   數學");
		for(int i=0;i<4;i++){
			if(i==0)
				System.out.print("甲");
				if(i==1)
				System.out.print("乙");
				if(i==2)
				System.out.print("丙");
				if(i==3)
				System.out.print("丁");
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
		System.out.println("丙的平均分數:"+s);
		System.out.println("國文的平均分數:"+s2);
		System.out.println("全班的平均分數:"+s6);
				
		
	}

}
