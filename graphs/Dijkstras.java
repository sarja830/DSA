package graphs;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstras {

	void  dijkstrasMain(int graph[][],int src )
	{
		int v = graph.length;
	
		int[] parent= new int[graph.length];
		Arrays.fill(parent, -1);
		int[] value= new int[graph.length];
		
		Arrays.fill(value, Integer.MAX_VALUE);
		value[src]=0;
		boolean[] processed= new boolean[graph.length];
		
		for(int i=0;i<v-1;i++)
		{
			int u= selectMinVertex(value,processed);
			
			processed[u]=true;
			
			for(int j=0;j<v;j++)
			{
				if(		graph[u][j]!=0 
						&& processed[j]==false 
						&& value[u]!=Integer.MAX_VALUE 
						&& value[u]+graph[u][j]<value[j])
				{
					value[j]=value[u]+graph[u][j];
					parent[j]=u;
				}
			}
		}
		printSolution(value); 
		
	}
	void printSolution(int value[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < value.length; i++) 
            System.out.println(i + " \t\t " + value[i]); 
    } 
	
	int selectMinVertex(int value[],boolean[] processed)
	{
		int v= value.length;
	int min=Integer.MIN_VALUE,minIdx=-1;
		for(int i=0;i<v;i++)
		{
			if(processed[i]==false && min>=value[i])
			{
				min=value[i];
				minIdx=i;
			}
		}
		return minIdx;
	}
	
	 public static void main (String[] args) 
	 { 
		 int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
             { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
             { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
             { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
             { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
             { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
             { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
             { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
             { 0, 0, 2, 0, 0, 0, 6, 7, 0 } }; 
             Dijkstras d = new Dijkstras();
             d.dijkstrasMain(graph,0);
             
	 }
		 

}
