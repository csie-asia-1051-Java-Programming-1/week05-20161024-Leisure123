package hw;
/*
 * Topic:���ϥΪ̿�J�@����� n�A�H�r�� '*' ��X����� n ������� (�ЧQ�ΰj��A���n������ printf �覡������X)�C
 * Date: 2016/10/24
 * Author: 105021011 �B�Э�
 */

import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("�п�Jn��:");
		int n = scn.nextInt();
		for(int i = n ; i >= 1 ; i--){
			for(int j = n ; j >= 1 ; j--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
