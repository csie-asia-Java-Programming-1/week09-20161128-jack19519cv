package hw;

import java.util.Scanner;

/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
public class hw02 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();int s=1;
        for(int i=0;i<n;i++){
        	s=s+i;
        	if(n>s){
        	
        	System.out.print(s+" ");
        	
        	}
        	
        	
        }
        System.out.println();
        
        for(int i = 1 ; i <= n ; i++){
			for(int j = 0 ; i >j ; j++){
    	
				System.out.print(i);
				
    	
    	
			}
			
			}

	}

}
