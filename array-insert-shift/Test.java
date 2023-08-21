public class Test{

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

public static void main(String[] args) {
    int [] y = {};
   int [] r = insertShiftArray(y,5);
 for (int i=0;i<(r.length);++i){
  System.out.println(r[i]);
}
}}