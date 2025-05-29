 public class AscendingOrder {
public static void main(String[] args)  {

	int[] numbers = new int[5];
		numbers[0] = 9;
		numbers[1] = 2;
		numbers[2] = 7;
		numbers[3] = 0;
		numbers[4] = 5;

		int largest = Integer.MAX_VALUE;
		int secondLargest = Integer.MAX_VALUE;
		int thirdLargest = Integer.MAX_VALUE;
		int forthLargest = Integer.MAX_VALUE;
		int fifthLargest = Integer.MAX_VALUE;	

	for(int num = 0; num < numbers.length; num++){

		if(numbers[num] < largest){
			secondLargest = largest;	
			largest = numbers[num]; 
			} 
		else if(numbers[num] < secondLargest){
				thirdLargest = secondLargest;
				secondLargest = numbers[num];
			}
		else if(numbers[num] < thirdLargest){
				forthLargest = thirdLargest;			
				thirdLargest = numbers[num];
			}
		else if(numbers[num] < forthLargest){
				fifthLargest = forthLargest;
				forthLargest = numbers[num];
			}
		else if(numbers[num] < fifthLargest){
				fifthLargest = numbers[num];
			}


				
		}
	System.out.print(largest + " " + secondLargest + " " + thirdLargest + " " + forthLargest + " " + fifthLargest); 
	

}
	}