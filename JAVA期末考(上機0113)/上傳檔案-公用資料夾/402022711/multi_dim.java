
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade[][] = {{78, 100},{59,80},{90,70},{65,120}};
		
		int binave = (grade[2][0] + grade[2][1]) / 2;
		int china = 0;
		for(int i = 0 ; i < grade.length ; i++){
			china = china + (grade[i][0] / 4);
			
		}
		int total = 0;
		
		for(int i = 0 ; i < grade.length ; i++){
			for(int j = 0; j < grade[i].length ; j++){
				total = total + (grade[i][j] / 8);
				
			}
			
			
		}
		
		System.out.println(grade[2][0] + " " + grade[2][1]);
		
		System.out.println("�����������Ƭ�: " + binave);
		System.out.println("��媺�������Ƭ�: " + china);
		System.out.println("���Z���������Ƭ�: " + total);

		
		
	}

}
