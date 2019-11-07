# Student Info
Name:Ng Ke Rong

No.Matrik:271063

# Introduction
In this assignment, I'm given a task to create a car loan calculator. So, I had to learn and produce pseuodocode and flowchart to let me easily to write program in Assignment 1. Before I create a calculation about the monthly repayment of car, yearly loan of car, yearly principal of car, yearly interest of car and the balance payment of car in year, I learn how to use if...else statement, while looping, create new method and create array in creating car loan calculator.

# Pseudo-Code
Start 

Declare variable for A, B, C and D

Output “Output “Car Price (RM):”

Input A

Output “Down Payment(RM):”

Input B

Output “Loan Period(Years):”

Input C

Output “Interest Rate(%):”

Input D

IF A more than or equal to 3000.00 and B more than or equal to 0.00 and C more than or equal to 5.00 and C less than or equal to 9.00 and D more than or equal to 3.00 and D less than or equal to 7.00 THEN

	Call method CalculateLoan(A,B,C,D)

ELSE THEN

	Print “Error, please enter again.”
END IF

Functions CalculateLoan(A,B,C,D)

Declare variable for Interest, Principal, Repayment, TotalPrinc, TotalInte, Balance, Years and i.

Initialize TotalPrinc to 0

Initialize TotalInte to 0

Initialize Balance to 0

Initialize Years to {"1st","2nd","3rd","4th","5th","6th","7th","8th"}

Initialize i to 0

Calculate Interest = D/100 * (A - B)

Calculate Principal = (A - B + Interest *C)/C

Calculate Repayment = Principal /12
	
	Output Repayment
	
	Print “YEARS”, PRINCIPAL", "INTEREST", "BALANCE"
	
	WHILE C is not equal to 0
	        
		Calculate TotalPrinc = Principal + TotalPrinc
            	
		Calculate TotalInte = Interest + TotalInte
        
		Calculate Balance = (Principal * C) - Principal	
	
	Output Years [i], TotalPrinc, TotalInte and Balance
	
	Decrease C by 1
	
	Increase i by 1
END WHILE

End Function

End

# Flowchart
 
https://github.com/ngkerong/Assignment1-2/blob/master/Flowchart%201.PNG?raw=true




