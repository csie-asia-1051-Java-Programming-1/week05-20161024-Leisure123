package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1/(1*2)+1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
 * Date: 2016/10/24
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jn��:");
		float n = scn.nextInt();
		double a = 0;
		double sum = 0;
		for(float i = 1 ; i <= n ; i++){
			a = a + 1/(((2*i)-1)*(2*i));
			sum = sum + a;
		}
		System.out.print("�p�⵲�G��:" + sum);

	}

}
