
import java.util.Scanner;

public class EmployeePayroll{

public static void main(String [] args){
Scanner input = new Scanner(System.in);

String mainMenu =  """

Semicolon employee payroll detail:

Select any of the option:

1. Add employee payroll
2. view employee payroll
3. update employee payroll
4. Exit

""";

System.out.println(mainMenu);
System.out.print("enter input(1-4): ");
int number = input.nextInt();


while True{
if(number == 1)

String name = "Enter Employee Name:"

System.out.println("Enter the number of hours worked in week: ");
 int numberHours = input.nextInt();

System.out.println("Enter hourly pay rate: "); 
int hourParRate = input.nextInt();
			
System.out.println("Enter federal holding tax: ");
double federalTaxWitholding = input.nextDouble();

federalTaxWitholding = 20 / 100;

System.out.println("Enter state_tax_withholding : ");
double stateTaxWithHolding = input.nextDouble();

stateTaxWithHolding = 9 / 100;

int grossPay = numberHours * hourParRate;

double totalDeduction = federalTaxWitholding + stateTaxWithHolding;
		
double netPay = grossPay - totalDeduction;

	break;

	}


}

}