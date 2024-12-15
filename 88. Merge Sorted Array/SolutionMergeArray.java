public class SolutionMergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int aux = m+n-1; //keeping the index of the next empty position
        int bigger;
        int i = n-1;
        int j = m-1;
        //while there are numbers to order in both arrays at the same time, order them with this logic
        while(i >= 0 && j >= 0){
            if(nums1[j] > nums2[i]){
                bigger = nums1[j];
                j = j-1;
            } else {
                bigger = nums2[i];
                i = i-1;
            }
            nums1[aux] = bigger;
            aux = aux-1;
        }

        //After one of them gets to the end we should evaluate two possibilities
        //1. If nums2 is completely ordered, all the numbers in nums1 are odered as well, nothing to do
        //2. If nums1 is completely ordered, we need to make sure nums2 is completely ordered, while i>=0 we order it.
        while(i >= 0){
            nums1[aux] = nums2[i];
            aux = aux-1;
            i = i-1;
        }
    }
}
