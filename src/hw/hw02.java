package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		long n = scn.nextLong();
		long sum = 0;
		int fin = 0;
		for(int i = 1 ; sum <= n ; i++){
			sum = sum + i;
			fin ++;
		}
		System.out.print("m值為:" + (fin-1));

	}

}
