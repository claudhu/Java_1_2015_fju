
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int list[][] = new int[4][2];    
	list[0][0] = 78;
	list[0][1] = 100;
	list[1][0] = 59;
	list[1][1] = 80;
	list[2][0] = 90;
	list[2][1] = 70;
	list[3][0] = 65;
	list[3][1] = 120;
	System.out.println("________________________");
	System.out.println("|       |  ���      |  �ƾ�    |");
	System.out.println("________________________");
	System.out.println("|   ��        |  "+list[0][0]+"  | "+ list[0][1]+"  |");
	System.out.println("________________________");
	System.out.println("|   �A        |  "+list[1][0]+"  | "+ list[1][1]+"   |");
	System.out.println("________________________");
	System.out.println("|   ��        |  "+list[2][0]+"  | "+ list[2][1]+"   |");
	System.out.println("________________________");
	System.out.println("|   �B        |  "+list[3][0]+"  | "+ list[3][1]+"  |");
	double bing = (list[2][0] + list[2][1])/2.0;
	double chinese = (list[0][0]+list[1][0]+list[2][0]+list[3][0])/4.0;
	double all = (((list[0][0]+list[0][1])/2.0) +((list[1][0]+list[1][1])/2.0)
			    +((list[2][0]+list[2][1])/2.0)+((list[3][0]+list[3][1])/2.0))/4.0;
	System.out.println("�����������Z�� : "+ bing);
	System.out.println("��媺�������Z�� : "+ chinese);
	System.out.println("���Z���������Z�� : "+ all);
	}

}
