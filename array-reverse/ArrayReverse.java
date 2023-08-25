public class ArrayReverse 

{	
	public	static int [] reverseArray (int[]arr){
		int[] myArray = new int[arr.length]; 
				if(arr.length==0){
				System.out.println("it's empty");
				return myArray;
			}
		int e=0;
		for (int i=arr.length-1;i>=0;--i){
		myArray[e]=arr[i];
		System.out.print(myArray[e]+" ");
		++e;}
		System.out.println();
		return myArray;
		}
	public static void main (String[] args) throws java.lang.Exception
	{

reverseArray(new int[]{1, 2, 3});
reverseArray(new int[]{});
reverseArray(new int[]{100});

  
}}
