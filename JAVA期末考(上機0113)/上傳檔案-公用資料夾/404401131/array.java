

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]={20,8,7,50,30,90,78,15,12,100,7};
		int key =78;
		for(int i=0;i<list.length;i++){
			if(list[i]==key){
				System.out.println("利用性搜尋法找尋78需要"+(i+1)+"次搜尋");
				}
		}
		for(int i=0;i<list.length;i++){
			int min=list[i];
			int index=i;
			for(int j=i+1;j<list.length;j++){
				if(min>list[j]){
					min=list[j];
					index=j;
				}
			}
				if(index!=i){
					list[index]=list[i];
					list[i]=min;
				}
				System.out.println(list[i]);
		}
		System.out.println("用2分法搜尋78要搜尋"+method(list,key)+"次");
	}
		public static int method(int list[],int key){
			int high=list.length-1;
			int low=0;
			int i=0;
			while(high>=low){
				
				int mid=(high+low)/2;
				if(key>list[mid]){
				low=mid+1;
				
					}
				else	if(key==list[mid]){
					return i+1;
					}
				else if(key<list[mid]){
					high=mid-1;
				}
				
				
				i++;
			}
			return i+1;
	
		}
	}
	


