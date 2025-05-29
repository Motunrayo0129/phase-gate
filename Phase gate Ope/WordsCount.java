public class WordsCount {
	public static int Word(String words, char ch) {

	int check = 0;
	for(int count = 0; count < words.length(); count++)  {
			if(ch == words.charAt(count)) {
				check++;
				}
					}
			return check;

				

		}


	} 