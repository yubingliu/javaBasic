package com.ybliu.algorithm.sort.selectSort;

//ֱ��ѡ������ 
/*ѡ�����򷨵ĵ�һ��ѭ������ʼԪ�ؿ�ʼѡ�������ڶ���Ԫ�أ���Ҫ����ÿ�ν���ĵڶ���ѭ��֮ǰ��
 * �����ѭ�����±긳ֵ����ʱ�������������ĵڶ���ѭ���У���������б������Сλ�ô���Ԫ�ظ�С��Ԫ�أ�
 * ���Ǹ���С��Ԫ�ص��±긳����ʱ����������ڶ���ѭ���˳��������ʱ�����ı䣬��˵�����бȵ�ǰ��
 * ��ѭ��λ�ø�С��Ԫ�أ���Ҫ��������Ԫ�ؽ���.
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
	        minIndex=i;//����������С���������±�
	        for(int j=i+1;j<a.length;j++)
	        {
	            //�����������ҵ���С���ݲ������������±�
	            if(a[j]<a[minIndex])
	            {
	                minIndex=j;
	            }
	        }
	        if(minIndex!=i)
	        {
	            //�����������������Сֵλ�ò���Ĭ�ϵĵ�һ�����ݣ��򽻻�֮��
	            temp=a[i];
	            a[i]=a[minIndex];
	            a[minIndex]=temp;
	        }
	    }
	}

}
