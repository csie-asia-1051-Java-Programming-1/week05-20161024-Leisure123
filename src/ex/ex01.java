package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System .out.print("請輸入n值:");
		long n = scn.nextLong();
		long a = n;
		long sum = 1;
		for(long i = n ; i >= 1 ; i-- ){
			sum = sum * i;
		}
		System.out.print(a +" ! = " + sum);

	}

}
