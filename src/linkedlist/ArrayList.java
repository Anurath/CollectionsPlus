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
		if(idx==index-1)
		{
			arr[index] = arr[index-1];
			arr[index-1] = val;
			index++;
			return true;
		}
		else if(idx<index-1) {
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
		System.out.println("Enter Valid Index!");
		return false;
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
	
	public Object get(int idx) {
		if (idx >= index) {
		    throw new ArrayIndexOutOfBoundsException("Index " + idx + " Array Ke Bahar Hai!");
		}
		return arr[idx];
	}
	
	public boolean set(int idx,Object val)
	{
		if (idx >= index) {
		    throw new ArrayIndexOutOfBoundsException("Index " + idx + " Array Ke Bahar Hai!");
		}
		arr[idx] = val;
		return true;
	}
	
	//Check Pointy
	public boolean remove(int idx)
	{
		return true;
	}
	
	public boolean remove(Object val)
	{
		return true;
	}
	
	public int length()
	{
		return index;
	}
	
	public void clear()
	{
		for(int i=0;i<index;i++)
		{
			arr[i] = null;
		}
		index = 0;
	}
	
	public int indexOf(Object val)
	{
		for(int i=0;i<index;i++)
		{
			if(arr[i]==null && val == null || arr[i] != null && arr[i].equals(val))
			{
				return i;
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object val)
	{
		for(int i = index-1;i>=0;i--)
		{
			if(arr[i]==null && val == null || arr[i] != null && arr[i].equals(val))
			{
				return i;
			}
		}
		return -1;
	}
}
