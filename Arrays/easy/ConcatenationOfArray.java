package Arrays.easy;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int nums[] = {1,2,1};
        System.out.println(getConcatenation(nums));
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];

        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i];
            if(i == nums.length-1)
            break;
        }
        for(int i=nums.length, j=0; i<ans.length; i++){
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
}
