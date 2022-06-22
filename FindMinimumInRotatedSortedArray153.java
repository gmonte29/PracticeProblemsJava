public class FindMinimumInRotatedSortedArray153 {

    public static void main(String[] args) {
        int [] nums ={2,3,4,5,1};
        System.out.println(findMin(nums));
    }

    //100% runtime, 46.23% memory solution for LeetCode 153
    public static int findMin(int[] nums) {

        int beg = 0;
        int end = nums.length-1;
        int mid = (beg+end)/2;
        int min = nums[mid];

        while(beg < end){
            if(mid == beg){
                int temp = Math.min(nums[mid], nums[end]);
                min = Math.min(temp, min);
                break;
            }

            if(nums[end] < nums[mid]){
                beg=mid+1;
            }
            else{
                end = mid-1;
            }
            mid = (beg+end)/2;
            min = Math.min(nums[mid], min);
        }

        return min;
    }

}
