public class PhaseGateMatrix {
	
	public static int[][] Array(int[][] nums){
	int anticlock = 0;
	int value = 0;
		int[][] arrays = new int[nums.length][nums[anticlock].length];

	for(int rows = nums.length - 1; rows >= 0; rows--){ 
		value = nums[rows].length - 1;
		for(int col = 0; col < nums[0].length; col++) {
		arrays[anticlock][col] = nums[value][anticlock];
			value--;
		}
			anticlock++;

				}
				return arrays;
			}


}
			
		



