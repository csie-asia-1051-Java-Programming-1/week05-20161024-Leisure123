package hw;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jn��:");
		long n = scn.nextLong();
		long sum = 1;
		long all = 0;
		for(int i = 1 ; 10000 >= sum ; i++){
			sum = sum * n;
			all ++;
		}
		System.out.print("�n " + all + " ����~��j��10000");

	}

}
