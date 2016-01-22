

public class multi_dim {
	public static void main(String[] args) {
    int a[][]={{78,100},{59,80},{90,70},{65,120}};
    int total=0,total1=0,total2=0;
    for(int i=0;i<2;i++){
    total+=a[2][i];
    }
    for(int j=0;j<4;j++){
    total1+=	a[j][0];
    }
    int average =total/2;
    int average2 =total1/4;
    for(int z=0;z<4;z++){
    	for(int x=0;x<2;x++){
    total2+=a[z][x];
    	}
    }
    int average3 =total2/8;
    System.out.println("丙平均分數"+average);
    System.out.println("國文平均分數"+average2);
    System.out.println("全班平均分數"+average3);
	}
}
