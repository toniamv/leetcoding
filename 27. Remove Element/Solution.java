class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int j = size-1;
        int i = 0; 
        int c = -1;//index of the last item != val placed

        while(i < j && size > 0){
            //if the first item of the array is val and there's another diferent in the end, switch it
            if(nums[i] == val && nums[j] != val){
                nums[i] = nums[j];
                c = i;
                i++;
                j--;
            //if the first item is diferent and the last is it, keep going, mark this item as the last diferent from val found (c)
            }else if(nums[i] != val && nums[j] == val){
                c = i;
                i++;
                j--;
            //if both numbers are val just move the end closer to the begining so you will find a diferent candidate to switch
            }else if(nums[i] == val && nums[j] == val){
                j--;
            //in this last else, if both numbers are diferent from val just move the begining further, so we can see if there's any val left to be switched with j
            }else{
                c = i;
                i++;
            }
        }
        if(i == j && nums[i] != val) c = i;
        return c+1;
    }
}