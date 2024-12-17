class Solution {
    //For this solution I had to do a research on the boyer-moore voting algorithm
    //which is the one I used here
    public int majorityElement(int[] nums) {
        //Get the length of numbers and start with count 1 since the first candidate to the maajority is the first item of the array
        int n = nums.length;
        int count = 1;
        int choice = nums[0];
        //While the array isn't over, substract or add count according to what happens
        for(int i = 1; i < n; i++){
            //if the next number found is equal to the candidate, add 1 to the count
            if(nums[i] == choice){
                count++;
            }else{
                //if it is not, substract
                count--;
                //after a substraction, if the count value is less than 0, change candidates and start over with count = 0
                if(count < 0){
                    choice = nums[i];
                    count = 0;
                } 
            }
            //This algorithm only works because in this case there is always a majority element that appears more than _n/2_ times
        }

        return choice;
        
    }
}