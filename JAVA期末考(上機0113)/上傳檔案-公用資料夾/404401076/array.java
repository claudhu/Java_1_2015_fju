

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={20,8,7,50,30,90,78,15,12,100,7};
		int key=78,count=0;
		for(int i=0;i<11;i++)
		{count++;
			if(key==array[i])
				System.out.println("1.Line Search總共搜尋"+count+"次");
		}
	    java.util.Arrays.sort(array);
	    System.out.println("2.選擇性排序,由小到大,顯示結果");
	    for(int j=0;j<11;j++)
	    	System.out.printf("%4d",array[j]);
		
		int low=0,high=array.length-1;
		int count2=0,key2=78;
		
		while(high>low)
		{ count2++;
			int mid=(low+high)/2;
			if(key2>mid)
				low=mid+1;
			else if(mid==key2)
				break;
			else 
				high=mid-1;
		}
		System.out.println();
		System.out.println("3.二元搜尋法在第"+count2+"次找到");
	}

}
