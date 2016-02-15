package com.ybliu.algorithm;

public class Knapsack {
		
		public static  void main(String args[])
		{
		   /*
		    经典的01背包问题是这样的：
		    有一个包和n个物品，包的容量为m，每个物品都有各自的体积和价值，
		    问当从这n个物品中选择多个物品放在包里而物品体积总数不超过包的容量m时，
		    能够得到的最大价值是多少？[对于每个物品不可以取多次，最多只能取一次，
		    之所以叫做01背包，0表示不取，1表示取]
		   */
			/*
			int[] w={3,4,5};
			int[] v={4,5,6};
			OneOAlgorithm(w,v,10);
			*/
			int[] w={2,3,1,4,6,5};
			int[] v={5,6,5,1,19,7};
			OneOAlgorithm(w,v,10);
		}
		public static int[][] OneOAlgorithm(int [] w,int v[],int W){
			
			int c[][]=new int[v.length+1][W+1];
			
			for(int i=0;i<=W;i++)
			{
				c[0][i]=0;
			}
			
			for(int i=1;i<=v.length;i++)
			{
				c[i][0]=0;
				
				for(int j=1;j<=W;j++)
				{
					if(w[i-1]<=j)
					{
						int a=c[i-1][j-w[i-1]]+v[i-1];
						
						int b=c[i-1][j];
						
						if(a>b)
						{
							c[i][j]=a;
							
						}else{
							
							c[i][j]=b;
						}
						
					}else{
						
						c[i][j]=c[i-1][j];
						
					}
					
				}
					
			}
			/*
			 * 输出
			 */
			for(int i=0;i<=v.length;i++)
			{
				for(int j=0;j<c[0].length;j++)
					{
						System.out.print("c["+i+"]["+j+"]="+c[i][j]+"    ");
					}
				System.out.println();
			}
			
			return c;
		}

}
