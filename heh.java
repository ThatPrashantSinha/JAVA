class heh{
    public int[] twoSum(int[] nums, int target) {
        int temp;
        int[] ind= new int[2];
        for(int i=0;i<nums.length;i++){
            temp=target-nums[i];
            for(int j=0;i<nums.length;j++){
                if(nums[j]==target-temp){
                    ind[0]=i;
                    ind[1]=i+1;
                }
            }

        }
        return ind;
    }
}