package hw;
/*
 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		float n = scn.nextInt();
		double a = 0;
		double sum = 0;
		for(float i = 1 ; i <= n ; i++){
			a = a + 1/(((2*i)-1)*(2*i));
			sum = sum + a;
		}
		System.out.print("計算結果為:" + sum);

	}

}
