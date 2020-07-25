class FindMinInRotatedSortedArrayThree{
    //Not ideal solution but runs in O(n)
    public int findMin(int[] nums) {
        int smallest = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                smallest = nums[i];
                break;
            }
        }
        return smallest;
    }
}