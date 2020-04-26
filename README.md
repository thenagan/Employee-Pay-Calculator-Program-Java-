# Employee-Pay-Calculator-Program-Java-
Employee Pay Calculator Program Java

For this assignment, you will take on the role of software developer as part of a team of developers for a retail company. The payroll manager of the company has tasked you with developing a Java program to quickly calculate an employee’s weekly gross and net pay. The program must prompt the user to enter the employee’s name, rate of pay, and hours worked. The output will display the information entered into the program along with the calculations for gross pay, total amount of deductions, and net pay.

In this coding assignment, you will utilize the Java syntax and techniques you learned while reviewing the required resources for Week 1. You may select appropriate variable names as long as proper Java syntax is used. You will also submit your source code.

Input:
In the input section, utilize Java syntax and techniques to input the employee’s name, rate of pay, and hours worked. The input should be completed either via keyboard or via file. As a last resort, the data can be hard-coded into the program.

Processing:
In the processing section, the following calculations will need to be performed in the processing section:

Gross Pay:
Gross pay if hours worked are 40 hours or less = hours worked * rate of pay
Gross pay if hours worked are greater than 40 hours = ((hours worked – 40) * (rate of pay * 1.5)) + (40 * rate of pay)
Example – Employee worked 55 hours. The employee’s rate of pay is $10.00.
((55 – 40) * (10 * 1.5)) + (40 * 10) = 625
The gross pay is $625.
Deductions:
Deductions are calculated based upon the following rates:
Federal Tax = 15%
State Tax = 3.07%
Medicare = 1.45%
Social Security = 6.2%
Unemployment Insurance = .07%
The following calculations are used to calculate each deduction:

Federal tax amount = federal tax rate* gross pay
State Tax amount = state tax rate * gross pay
Medicare amount = Medicare rate * gross pay
Social Security amount = social security rate * gross pay
Unemployment Insurance amount = unemployment insurance amount * gross pay
Total deductions = Federal Tax amount + State Tax amount + Medicare amount + Social Security amount + Unemployment Insurance amount

Net Pay:
The net pay amount is calculated as follows:
Net pay = gross pay amount – total deductions
Output:
The Java program should display the following information:

Employee Name
Rate of Pay
Hours Worked
Overtime Worked
Gross Pay
Total amount of deductions
Net Pay
