class FindMinInRotatedSortedArrayThree{
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