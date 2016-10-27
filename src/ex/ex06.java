package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1;
		System.out.print("共有幾人:");
		int n = scn.nextInt();
		int data[ ] = new int [n];
		for(int i = 0 ; i < n ; i++){
			System.out.print("請輸入學號:");
			data[i] = scn.nextInt();
		}
		for(int i = 0 ; i < data.length - 1 ; i++){
			
				if(data[i] < data[i + 1]){
					 v1 = data[i + 1];
					data[i+1]=data[i];
					data[i]=v1;
				}
			
		}
		for(int i = 0 ; i < data.length ; i ++){
			System.out.print(data[i] + " ");
		}

	}

}
