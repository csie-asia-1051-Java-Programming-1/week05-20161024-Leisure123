package hw;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時： 
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入n值:");
		int n =scn.nextInt();
		int data[ ][ ]=new int[n][n];
		int sum = 1;
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j <= i ; j++){
				data[i-j][j]=sum;
				sum++;
			}
		}
		for(int i = 1 ; i < n ; i++){
			for(int j = 0 ; j < n - i ; j++){
				data[n-j-1][i+j]=sum;
				sum++;
			}
		}
		System.out.println("----------輸出結果----------");
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
