package searching;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,23,45,47,78,88,100};
        System.out.println(cell(arr,9));
    }

    public static int cell(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(num == arr[mid])
                return arr[mid];
            else if(num < arr[mid])
                end = mid -1;
            else
                start = mid + 1;
        }
        if(start >= arr.length)
            return -1;
        return arr[start];
    }
}
