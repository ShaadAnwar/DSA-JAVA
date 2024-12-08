package searching;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int max = 0,sum = 0;
        for(int i: nums){
            if(i > max)
                max = i;
            sum+=i;
        }
        int start = max;
        int end = sum;
        System.out.println(search(nums,k,start,end));
    }

    public static int search(int[] nums, int k, int start, int end){
        while(start < end){
            int mid = start + (end-start)/2;
            if(piecesFormed(nums,mid) <= k )
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static int piecesFormed(int[] nums, int sum){
        int pieces = 0;
        int presentSum = 0;
        for(int i: nums){
            if((presentSum + i) > sum) {
                presentSum = 0;
                pieces++;
            }
            else
                presentSum+=i;
        }
        return pieces;
    }
}
