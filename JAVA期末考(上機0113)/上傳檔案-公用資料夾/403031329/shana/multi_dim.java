

public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade[][]={{78,59,90,65},{100,80,70,120}};
		
		System.out.printf("������������:  %f\n",(grade[0][2]+grade[1][2])/2.0);
		
		int ct=0;
		int mt=0;
		for(int i=0;i<4;i++){
			ct+=grade[0][i];
		
			mt+=grade[i][i];
			

			System.out.println("��妨�Z����������:  "+ct/4.0);
			System.out.println("���Z����������: "+(ct+mt)/8.0);
			
		}
		
	
		
		}
	}


