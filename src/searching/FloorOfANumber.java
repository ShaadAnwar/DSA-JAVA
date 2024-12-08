package searching;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,23,45,47,78,88,100};
        System.out.println(floor(arr,1));
    }

    public static int floor(int[] arr, int num){
        if(num < arr[0])
            return -1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == num)
                return num;
            else if(arr[mid] > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[end];
    }
}
