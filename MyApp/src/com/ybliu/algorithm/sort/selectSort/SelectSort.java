package com.ybliu.algorithm.sort.selectSort;

//直接选择排序 
/*选择排序法的第一层循环从起始元素开始选到倒数第二个元素，主要是在每次进入的第二层循环之前，
 * 将外层循环的下标赋值给临时变量，接下来的第二层循环中，如果发现有比这个最小位置处的元素更小的元素，
 * 则将那个更小的元素的下标赋给临时变量，最后，在二层循环退出后，如果临时变量改变，则说明，有比当前外
 * 层循环位置更小的元素，需要将这两个元素交换.
 */
public class SelectSort {
	
	public static void selectSort(int[]a)
	{
	    int minIndex=0;
	    int temp=0;
	    if((a==null)||(a.length==0))
	        return;
	    for(int i=0;i<a.length-1;i++)
	    {
	        minIndex=i;//无序区的最小数据数组下标
	        for(int j=i+1;j<a.length;j++)
	        {
	            //在无序区中找到最小数据并保存其数组下标
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	}

}
