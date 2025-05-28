public class PhasegateIndex {

		public static boolean Index(String numbers)  {
		int word = 0;
	for(int index = 0; index < numbers.length(); index++)  {
			int confirm = 0;
		for(int indices = 0; indices < numbers.length(); indices++) {
			if(index == numbers.charAt(indices)) { 
				confirm++;
					}
				}
			if (word != numbers.charAt(index)){
				word++;
		}
			
			if (word == numbers.length()){
	
			 
			}

			return true;	
							
			}
			return false;
	}


public static int[] Unique(int[] numbers)  {
	int occurence = 0;	
for(int num = 0; num < numbers.length; num++)  {
	int count = 0;
	for(int check = 0; check = numbers.length; check++) {
		if(number[num] == number[check]){
			count++;
			occurence += number[check];
			}
	}
		
		return occurence;


}

	}

}











}  