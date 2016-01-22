

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1=78;
		int a2=100;
		int b1=59;
		int b2=80;
		int c1=90;
		int c2=70;
		int d1=65;
		int d2=120;
		
		
		double totalc=(c1+c2);
		double avec= totalc/2;
		System.out.println("丙的平均分數"+avec);
		
		double totalch=(a1+b1+c1+d1);
		double avech = totalch/4;
		System.out.println("國文成績平均"+avech);
		
		double totala=(a1+a2);
		double avea= totala/2;
		
		double totalb=(b1+b2);
		double aveb= totalb/2;
		
		double totald=(d1+d2);
		double aved= totald/2;
		
		double allave = (avea+aveb+avec+aved)/4;
		System.out.println("全班的平均分數:"+allave);

	}

}
