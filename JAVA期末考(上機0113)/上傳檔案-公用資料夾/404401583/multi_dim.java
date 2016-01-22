
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][]={{78,100},{59,80},{90,70},{65,120}};

double a =(abc[2][0]+abc[2][1])/2.0;
System.out.println("丙的平均分數為 : "+a);

double totala =((abc[0][0]+abc[1][0]+abc[2][0]+abc[3][0])/ 4.0); 
System.out.println("國文的平均分數 : "+totala);

double total = (abc[0][0]+abc[0][1]+abc[1][0]+abc[1][1]+abc[2][0]+abc[2][1]+abc[3][0]+abc[3][1])/8;
System.out.println("全班平均分數為 : "+total);
	}

}
