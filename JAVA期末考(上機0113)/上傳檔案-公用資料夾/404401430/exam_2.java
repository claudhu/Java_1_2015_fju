

import java.util.Scanner;

public class exam_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("�п�J�z���벼(1.�����ۡB2.�����^�B3.�������B4.�o��):");
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for(int i=0;i<9;i++){
			int vote = input.nextInt();
			System.out.printf("��������`�Τj��A�п�J�z����\n"
					+ "����ܡA�ثe�z�٦�%d�i�ﲼ\n",(9-i));
			System.out.printf("(�@�B)������\n"
					+ "(�G�B)�����^\n"
					+ "(�T�B)������\n"
					+ "(�|�B)�o��\n");
			
			if(vote==1)
				count1++;
			else if(vote==2)
				count2++;
			else if(vote==3)
				count3++;
			else
				count4++;
		}
		System.out.printf("�j�ﵲ�G�έp:\n"
				+"(�@�B)������ %d ��\n"
				+ "(�G�B)�����^ %d ��\n"
				+ "(�T�B)������ %d ��\n"
				+ "(�|�B)�o�� %d ��",count1,count2,count3,count4);
		
		input.close();

	}

}
