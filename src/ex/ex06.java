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
		System.out.print("共有幾人:");
		int n = scn.nextInt();
		int data[ ] = new int [n];
		for(int i = 0 ; i < n ; i++){
			System.out.print("請輸入學號:");
			data[i] = scn.nextInt();
		}
		for(int i = 0 ; i < data.length - 1 ; i++){
			for(int j = 0 ; j < data.length -i - 1 ; j++){
				if(data[j + 1]< data[j]){
					int v1 = data[j + 1];
					data[j+1]=data[j];
					data[j]=v1;
				}
			}
		}
		System.out.print(data[n]);

	}

}
