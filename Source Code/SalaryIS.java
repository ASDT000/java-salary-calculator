import java.util.*;
class SalaryIS{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("|                       SALARY INFORMATION SYSTEM                         |");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("        [1] Calculate Income Tax");
		System.out.println("        [2] Calculate Annual Bonus");
		System.out.println("        [3] Calculate Loan Amount");
		System.out.print("\n\nEnter an option to continue > ");
		int option = input.nextInt();
		
		
		
		
		if (option == 1){
			
			incomeTax();
			
			
		}else if (option == 2){
			
			annualBonus();
			
			
		}else if (option == 3){
			
			loanAmmount();
			
			
		} else {
			
			System.out.println("\n Please Enter Valid Option");
			
		}
		
	
		
		
	}	
	
		public static void incomeTax(){
			Scanner input = new Scanner(System.in);
			
			System.out.println("\n---------------------------------------------------------------------------");
			System.out.println("|                         Calculate Income Tax                            |");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println();
			System.out.print("Input Employee Name   - ");
			String name = input.next();
			System.out.print("Input Employee Salary - ");
			int salary = input.nextInt();
			
			int zeroth;
			int incomeTax =0 ;
			int first;
			int second;
			int third ;
			int fourth;
			int fiveth;
			int sixth;
			
			if (salary <100000){
				
				incomeTax = 0;
				
			}else if (salary <141667){
				
				incomeTax = (int)(((salary-100000)%41667)* 0.06);
				
			} else if (salary <183333){
				
				incomeTax = (int) (((41667)* 0.06) + (( salary - 141667)* 0.12 ));
				
			} else if (salary <225000){
				
				incomeTax = (int) (((41667)* 0.06) + (41667* 0.12 ) + (( salary - 183333)* 0.18 ));
			
			}  else if (salary <266667){
				
				incomeTax = (int) (((41667)* 0.06) + (41667* 0.12 ) + (41667* 0.18 ) +(( salary - 266667)* 0.24 ));
			
			}  else if (salary <308333){
				
				incomeTax = (int) (((41667)* 0.06) + (41667* 0.12 ) + (41667* 0.18 ) +(41667* 0.24 ) +(( salary - 308333)* 0.3 ));
			
			} else if (salary > 308333){
				
				incomeTax = (int) (((41667)* 0.06) + (41667* 0.12 ) + (41667* 0.18 ) +(41667* 0.24 ) +(41667* 0.30 ) +((salary-308333)*0.36 ));
				
			}
			
			
			 
			System.out.println("\nYou have to pay Income tax per month: "+incomeTax );
			
			
		}
		
		public static void annualBonus(){
			Scanner input = new Scanner(System.in);
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("|                         Calculate Annual Bonus                          |");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println();
			
			
			System.out.print("Input Employee Name   - ");
			String name = input.next();
			System.out.print("Input Employee Salary - ");
			int salary = input.nextInt();
			
			double bonus = 0;
			
			if (salary <100000){
				bonus = 0;
			} else if (salary < 200000){
				bonus = 0.1;
				
			} else if (salary < 300000){
				bonus = 0.15;
			} else if (salary < 400000){
				bonus = 0.2;
			} else if (salary >= 400000){
				bonus = 0.35;
			} else {
				System.out.println("Somthing Wrong! Please check salary you Entered ...");
			}
			
			double annualBonus =  (salary * bonus) ;
			System.out.println("\nAnnual Bonus   - "+(annualBonus));
			
			
		}
		
		public static void loanAmmount(){
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("|                         Calculate Loan Ammount                          |");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println();
			
			
			System.out.print("Input Employee Name   - ");
			String name = input.next();
			System.out.print("Input Employee Salary - ");
			int salary = input.nextInt();
			
			if (salary < 50000) {
				
				System.out.println("You cannot get a loan");
				
			} else {
				
				
				System.out.print("Enter number of year : ");
				int noOfYear = input.nextInt();
				
				if (noOfYear < 1 || noOfYear > 5) {
                System.out.println("The loan period must be between 1 and 5 years.");
            } else {
                
                final double annualInterestRate = 0.15; 
                double monthlyInstalment = salary * 0.6; 
                double monthlyRate = annualInterestRate / 12;
                int numOfMonths = noOfYear * 12; 

               
                double loanAmount = monthlyInstalment * (1 - (1 / Math.pow(1 + monthlyRate, numOfMonths))) / monthlyRate;

               
                loanAmount = Math.round(loanAmount / 1000) * 1000;

               
                System.out.println("\nYou can get a Loan Amount of: Rs. " + loanAmount);
            }

			}
			
			
			
			
			
			
			
			
		}
		
		
	
	
	
}
