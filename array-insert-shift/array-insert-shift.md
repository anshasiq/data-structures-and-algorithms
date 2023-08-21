# whiteBoard
## the picture
![Alt Text](null(2).png)

### Approach & Efficiency
Problem Domain:
I have an array with a number  and i should return array with the number in the middle of it.



### visual:
input: [1,2,3],5 ==> output [1,2,5,3]

### Algorithm:
In order to put the number in the midlle of array.
- get the index middle
- make a new array with lenght+1
- itrate through the first array and put all values in second one 


## Big O:
O(n)

## Code:
<pre>
 static int[]insertShiftArray(int [] arr,int n){
    int[] numbers = new int[(arr.length)+1];
    if(arr.length==0){
        System.out.println("error");
        return new int[0];
    }
    if(arr.length==1){
    numbers[0]=arr[0]; numbers[1]=n;
    return numbers;}
    float m = (float)arr.length/2;
    double roundedUp = Math.ceil(m);
    int e=0;
    for (int i=0;i<(arr.length);++i){
        if(i==(roundedUp)){;
        continue;}
        numbers[i]=arr[e];
        ++e;
    }
    numbers[(int)roundedUp]=n;
    numbers[numbers.length-1]=arr[arr.length-1];
  
    return numbers;  
} 


main ==============>

  int [] y = {1,2,3,4};
   int [] r = insertShiftArray(y,5);
 for (int i=0;i<(r.length);++i){
  System.out.println(r[i]);
}
</pre>

## test cases:

<pre>input 
{1,2,4,5} 3
output 
[1 2 3 4 5]

input 
{1} 5
output 
[1 5] 

input 
{}
output 
error
</pre>
