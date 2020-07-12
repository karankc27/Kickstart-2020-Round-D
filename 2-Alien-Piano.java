//Java Solution
import java.io.*;
import java.util.*;
class Solution {
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int test=sc.nextInt();
		for(int j=1;j<=test;j++){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		    System.out.println("Case #"+j+": "+solve(n,arr));
		}
	}
 
 public static int solve(int n,int arr[])
{
 int count=0;
 
 int t1=0,t2=0;
 
 for(int i=1;i<n;i++)
 {
  if(arr[i]>arr[i-1])
  {
   t1++;
   t2=0;
   if(t1==4)
   {
    t1=0;
    count++;
   }
  }
  else if(arr[i]<arr[i-1])
  {
   t2++;
   t1=0;
   if(t2==4)
   {
    t2=0;
    count++;
   }
  }
 }
 
 return count;
}
}
