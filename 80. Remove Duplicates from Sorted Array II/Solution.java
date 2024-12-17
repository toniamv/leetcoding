class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; //We establish this so the algorithm doesnt calculate this everytime it needs it
        
        //we gonna start (last) number aloccated in the firts position of the array. But if it has no item in it, we need to return 0 right here
        if(n == 0){
            return 0;
        }

        //(last) refers to the last item of the array that was classified as unique
        int last = 0;
        int b = 0;
        //we iterate over the array until the end of it
        for(int i = 1; i < n; i++){
            //as it is an ordered array in non-decresing order, for an element to be different from another it just needs to be bigger, or else it would be equal. So as we iterate the other items from the array, if we find one that is bigger than the last unique, it is the next unique, so last = last+1 and nums[last] = new item's value  
            if(nums[i] == nums[last]){
                if(b < 1){
                    last = last+1;
                    nums[last] = nums[i];
                    b++;    
                }
            }else{
                last = last+1;
                nums[last] = nums[i];
                b = 0;  
            }
        }
        //as it was described, to get the quantity of unique items we need to get the last index found+1 (since it starts with 0)
        return last + 1;
    }
}