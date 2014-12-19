I am using gradle project as build control so please follow the below instructions to run the unit tests and the code.

1. Run the unit tests: 
	a. Go to the %RotationProblem% folder
	b. call this command (gradlew test) from terminal screen to generate the test case report
	c. Go to  %RotationProblem%/build/reports/tests
	d. open index.html web page, this page contains all test cases results

2. Run the system
	a. Go to the %RotationProblem% folder
	b. call this command (gradlew jar) from terminal screen to generate the jar file
	c. call this command (executeRotation.bat "array's items with comma saparated" position) ==> executeRotation.bat "1, 2, 3, 4, 5, 6" 2

Rotation alogrithm: There is more than one way to implemnt the rotation business as below:
	1. Rotation with reverse method: The total big O ==> O(n)
		a. Reverse All items		O(n)
		b. Reverse the first part	O(n)
		c. Reverse the last part	O(n)

	2. Rotation in the place: Best case O(n), worst case O(n^2)
		a. Rotate all array's items each time, so if the position is 10 then we need to rotate all array's items 10 times

	3. Rotation using a new array: The total big O ==> O(n)
		a. Copy the last items from an old array(the last items identify starting of the passed position) to the beginning of the new array O(n)
		b. Copy the first items from an old array(the first items starting from 0 index until position index) to the end of the new array   O(n)

compare them:
	1. The first and third algorithms are better than the second one
	2. The Third one is still better than the first one but we have a space issue when the array is large
	
	so I was going with the first algorithm		