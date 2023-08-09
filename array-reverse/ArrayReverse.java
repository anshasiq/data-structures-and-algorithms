public class ArrayReverse 

{	public	static void reverseArray (int[]arr){
// System.out.print (arr.length);
for (int i=arr.length-1;i>=0;--i)
System.out.print(arr[i]+" ");
System.out.println();
}
	public static void main (String[] args) throws java.lang.Exception
	{

// int[] test= {2,2};

reverseArray(new int[]{1, 2, 3});
reverseArray(new int[]{});
reverseArray(new int[]{100});

  
}}
