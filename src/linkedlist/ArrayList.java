package linkedlist;

import java.util.Arrays;

public class ArrayList {

	private int size ;
	private int index;
	private Object[] arr;
	
	public ArrayList()
	{
		size = 10;
		arr = new Object[10];
	}
	
	public ArrayList(int initialCapacity)
	{
		size = initialCapacity;
		arr = new Object[initialCapacity];
	}
	
	public int index()
	{
		return index;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean add(Object val)
	{
		arr[index++] = val;
		if(index==size)
			resize();
		return true;
	}
	
	public boolean add(int idx,Object val)
	{
		
		if(idx>index)
			return false;
		if(idx==index)
		{
			arr[index+1] = arr[index];
			arr[index] = val;
			index++;
			return true;
		}
		else {
			for(int i=index+1;i>idx;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[idx] = val;
			index++;
			if(size==index)
				resize();
			return true;
		}
	}
	
	public void iterator()
	{
		System.out.print('[');
		for(int i=0;i<index;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	
	
	public void resize()
	{
		Object[] temp = new Object[size*2];
		for(int i=0;i<size;i++)
		{
			temp[i] = arr[i];
		}
		arr = temp;
		size*=2;
	}
	
}
