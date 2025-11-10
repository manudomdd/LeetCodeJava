package removeElement;

public class RemoveElement {
	
	public static int[] removeElement(int[] nums, int val) {
        int count = 0; 

        for (int i = 0; i < nums.length; i++){
            count += nums[i] != val ? 0 : 1; 
        }

        int newArray[] = new int[count];
        int index = 0;  

        for (int num : nums) {
            index += (num != val) ? (newArray[index] = num) * 0 + 1 : 0;
        }

        return newArray; 
    }

    public static void main (String[] args) {
        int[] nums = {3, 2, 2, 3}; 
        int val = 3; 

        int[] result = removeElement(nums, val); 

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " "); 
        }
    }

}
