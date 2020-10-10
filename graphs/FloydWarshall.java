package graphs;


//A Java program for Floyd Warshall All Pairs Shortest 
//Path algorithm. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 


class FloydWarshall 
{ 
	
	static int INF = 9999;
	
	 public void shortestPath(int [][]a)
	 {
		 for(int k=0;k<a.length;k++)
		 {
			 for(int i=0;i<a.length;i++) 
			 {
				 for(int j=0;j<a[0].length;j++)
				 {
					 	a[i][j]= Math.min(a[i][j],a[i][k]+a[k][j]);
				 }
			 }
		 }
	 }
	 
	 public static void main (String[] args) 
	 { 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter the vertices \n");
		 
		 int n = sc.nextInt();
		 int[][] a= new int[n][n];
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 a[i][j]=-1;
			 }
		 }
		 //no of edges
		 int m = sc.nextInt();
		 //no of querires
		 int q = sc.nextInt(); 
		 for(int k=0;k<m;k++)
		 {
			 int i=sc.nextInt();
			 int j = sc.nextInt();
			 a[i][j]=sc.nextInt();
			 
		 }
		 
		 
		 
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a[0].length;j++)
			 {
				 if(i==j)
				 	a[i][j]=0;
				 else if(a[i][j]==-1)
					 a[i][j]=INF;
			 }
		 }
		
		 FloydWarshall f = new FloydWarshall();
		 f.shortestPath(a);
		 for(int k=0;k<q;k++)
		 {
			 int i=sc.nextInt();
			 int j = sc.nextInt();
			 System.out.println(a[i][j]);
			 
		 }
		 for(int i=0;i<a.length;i++) 
		 {
			 for(int j=0;j<a[0].length;j++)
			 {
				 	System.out.print(a[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
	 } 
} 