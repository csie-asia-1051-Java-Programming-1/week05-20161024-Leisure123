package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�Jn��:");
		long n = scn.nextLong();
		long sum = 0;
		int fin = 0;
		for(int i = 1 ; sum <= n ; i++){
			sum = sum + i;
			fin ++;
		}
		System.out.print("m�Ȭ�:" + (fin-1));

	}

}
