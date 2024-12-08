package searching;

public class RotationCountSortedArray {
    public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};
        //int[] nums = {1,2,3,4,5,6};
        int pivot = getPivot(nums);
        System.out.println("Pivot = "+pivot);
        int ans = pivot + 1;
        System.out.println(ans);
    }

    public static int getPivot(int[] nums){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid != nums.length-1 && nums[mid] > nums[mid+1])
                return mid;
            else if(nums[start] > nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}

