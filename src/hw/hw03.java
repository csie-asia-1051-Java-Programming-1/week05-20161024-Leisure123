package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		long n = scn.nextLong();
		long sum = 1;
		long all = 0;
		for(int i = 1 ; 10000 >= sum ; i++){
			sum = sum * n;
			all ++;
		}
		System.out.print("要 " + all + " 次方才能大於10000");

	}

}
