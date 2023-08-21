public class Binary
{
 public static int index(int[] arr, int sk) {
        int l=0 , r=arr.length-1 , m=(r+l)/2;
        while (l <= r) {
        if(arr[m]==sk)
        return m;
        else if(arr[m]<sk)
        l=m+1;
        else
        r=m-1;
        m=(r+l)/2;
        }

     return -1;
    }
    public static void main(String[] args) {
        int [] sorted_array={-131, -82, 0, 27, 42, 68, 179};
    System.out.println(index(sorted_array,2));
    }}