# whiteBoard
## the picture
![Alt Text](null(1).png)

### Approach & Efficiency
Problem Domain:
Reversing the elements of an array.

visual:
input: [1,2,3] ==> output [3,2,1]

Approach & Efficiency
Problem Domain:
Reversing the elements of an array.

### visual:
input: [1,2,3] ==> output [3,2,1]

### Algorithm:
In order to reverse the elements of the array we need to make a backward loop from the last index to the first one and assaign the last index to another array to be the first index of it and so on until the first index of the original array becomes the last index of the revered array

## Solution:

Code:
<pre>public class ArrayReverse 

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

  
}}</pre>

## test cases:

<pre>input 
{1,2,3,4,5}
output 
[5 4 3 2 1]

input 
{1}
output 
[1] 

input 
{}
output 
[]
</pre>
