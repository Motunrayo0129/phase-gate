public class LargestIndex {
public static int Largest(int[] numbers)  {
	

		
		int max = numbers[0];
		int counter = 0;
for(int index = 0; index < numbers.length; index++) {
		if(numbers[index] > max){
			max = numbers[index];
			counter = index;
				
		}
			}
		return counter;

}
			 

}