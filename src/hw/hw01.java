package hw;
/*
 * Topic:讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */

import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n = scn.nextInt();
		for(int i = n ; i >= 1 ; i--){
			for(int j = n ; j >= 1 ; j--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
