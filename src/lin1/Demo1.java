package lin1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数！！！");
		int a=sc.nextInt();
		/*int b=sc.nextInt();
		int c=sc.nextInt();*/
		int[] arr;
		arr = new int[a];
		fangfa1(arr);
		fangfa(arr);

	}

	public static void fangfa(int[] b) {
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);

		}
	}
	public static void fangfa1(int[] c){
		int k=0;
		for(int j=1;j<=c.length;j++){
			
			c[k]=j;
			k++;
		}
	}
	
	
}
