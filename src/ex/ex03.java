package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		long n = scn.nextLong();
		long a = 1;
		long sum = 0;
		for(long i = 1 ; i <= n ; i++){
			a *= 2;
			sum = sum + a;
		}
		System.out.print(sum);

	}

}
