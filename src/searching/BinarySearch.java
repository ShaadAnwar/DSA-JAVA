package searching;

class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,23,45,47,78,88,100};
        System.out.println(search(arr,45));
    }

    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //int mid = start + (end-start)/2;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid])
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
