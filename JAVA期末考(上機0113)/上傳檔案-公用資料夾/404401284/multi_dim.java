public class multi_dim {

	public static void main(String[] args) {
		// ���B(20%) �եH�u�G���}�C�v�إ߾ǥͦ��Z��p�k��G
		// 1. ����ܡG������������
		// 2. ����ܡG��妨�Z����������
		// 3. ����ܡG���Z����������
		/*
		        ���      �ƾ�
		��     78   100
		�A     59    80
		��     90    70
		�B     65   120
		
		*/
		
		int[][] arr = new int[3][1];

		arr[0][0] = 78 ;
		arr[0][1] = 100 ;
		arr[1][0] = 59 ;
		arr[1][1] = 80 ;
		arr[2][0] = 90 ;
		arr[2][1] = 70 ;
		arr[3][0] = 65 ;
		arr[3][1] = 120 ;

		System.out.println(arr);
		
		System.out.println("�����������Ƭ�" + (arr[2][0]+arr[2][1])/2 );
		System.out.println("��妨�Z���������Ƭ�" + (arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0])/2 );
		System.out.println("�����������Ƭ�" + (arr[2][0]+arr[2][1])/2 );

		
	}
	

}
