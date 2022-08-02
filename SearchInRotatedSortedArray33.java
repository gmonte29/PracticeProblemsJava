public class SearchInRotatedSortedArray33 {

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 2));

    }

    //100% runtime, 80% memory solution for LeetCode 33
    //https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static int search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length-1;
        int mid = (beg+end)/2;

        if(nums.length<=3){
            if(nums[mid] == target) return mid;
            if(nums[beg] == target) return beg;
            if(nums[end]== target) return end;
        }

        while(beg < end){
            if(nums[mid] == target) return mid;
            if(nums[beg] == target) return beg;
            if(nums[end]== target) return end;

            if(target < nums[mid]){
                if(nums[beg] < nums[mid] && nums[beg] > target){
                    beg=mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(nums[end] > nums[mid] && target > nums[end]){
                    end = mid-1;
                }
                else{
                    beg = mid+1;
                }
            }
            mid = (beg+end)/2;
        }

        return -1;
    }
}
