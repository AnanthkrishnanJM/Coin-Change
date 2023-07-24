package Coinchange;

import java.util.Scanner;

class coin {

	public static int CoinChange(int n,int a,int ar[]) {
		
		    int count=0;
		    int result=0;
	    	int i=n-1;
	    	while(result!=a && i>=0 ) {
		    	if(result+ar[i]<=a) {
				 result+=ar[i];
				 count++;
			}
			else {
				i--;
			}
		}
	    if(result==a) {
	    	return count;
	   }
     	else {
		return -1;
   }
}

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		int n=A.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=A.nextInt();
		}
		int a=A.nextInt();
		int value=CoinChange(n,a,ar);
		System.out.println(value);
	}



	}


