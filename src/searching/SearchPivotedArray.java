package searching;

public class SearchPivotedArray {
    //This code will not work for duplicate Elements in Array
    //eg: int[] nums = {2,9,2,2,2};
    public static void main(String[] args) {
        //int[] nums = {5,1,3};
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int pivot = getPivot(nums);
        System.out.println("Pivot = "+pivot);
        int ans;
        if(nums[pivot] == target) {
            System.out.println("ans = " + pivot);
            return;
        }
        else if(nums[0] < target)
            ans = search(nums,target,0,pivot-1);
        else
            ans =  search(nums,target,pivot+1,nums.length-1);

        System.out.println(ans);
    }

    public static int getPivot(int[] nums){
        int start = 0, end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid+1])
                return mid;
            else if(nums[start] > nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    public static int search(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}


