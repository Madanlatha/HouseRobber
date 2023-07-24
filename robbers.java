package HouseRobber;

import java.util.Scanner;

public class robbers {
	int houseRobber(int arr[],int n) {
		int sum=0;
		for(int i=0;i<n;i+=2) {
			sum+=arr[i];
		}
		return sum;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		robbers ro=new robbers();
		System.out.println(ro.houseRobber(arr,n));
	}

}
