package searching;

public class SearchingInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,23,45,47,78,88,100};
        System.out.println(ans(arr,7));
    }

    public static int ans(int[] arr, int target){
        int start = 0,end = 1;
        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }

    public static int search(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                end = mid -1;
            else
                start = mid+1;
        }
        return -1;
    }
}
