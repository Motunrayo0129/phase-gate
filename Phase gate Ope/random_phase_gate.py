import random

	num1 = random.randrange(1, 9)
	num2 = random.randrange(1, 9)
	if num1 > num2:
		correct_answer = num1 - num2
score = 0;
counter = 0;
attempt = 0;
for number in range(1, 10):		
	user_answer = int(input(f"find the difference between {num1} and {num2}? "))
        if user_answer == correct_answer:
        	score++
        	if counter == 10:
			attempt++;
break
        elif user_answer != correct_answer: 
        	attempt++;
	print(score)


