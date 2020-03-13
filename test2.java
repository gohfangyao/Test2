import java.util.Scanner;
public class Test2 {

    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
        String name,id,incomeType;
        double incomeAmount,incomeTax;
        System.out.print("Enter staff name: ");
        name = sc.nextLine();
        System.out.print("Enter staff ID: ");
        id = sc.nextLine();
        System.out.print("Enter income type: ");
        incomeType = sc.nextLine();
        System.out.print("Enter income amount: ");
        incomeAmount = sc.nextDouble();
        System.out.print("Enter income tax percentage: ");
        incomeTax = sc.nextDouble();

     Income income = new Income(incomeType,incomeAmount,incomeTax);
      
       
     Staff info = new Staff(name,id,income);
     
     info.displayStaffInfo();
     System.out.println();
     info.displayIncomeInfo();
     }
}
     
      class Staff{
        String name;
        String id;
        Income Income;
         
        Staff(String name,String id,Income Income){
           this.name=name;
           this.id=id;
           this.Income=Income;
         }
          
         String getName(){
           return name;
         }
            
            String getId(){
              return id;
            }
               
               double calculateNetIncome(){
                  return Income.getAmount() - Income.getTotalTax();
               }
                  
       void displayStaffInfo(){
               
               System.out.println("Staff Info");
               
               System.out.println("Name:" +name);
               System.out.println("ID:" +id);
       }
              
       void displayIncomeInfo(){
              
               System.out.println("Income Info");
               System.out.println("Income Type:" +Income.getIncomeType());
               System.out.println("Amount of Income:RM" +Income.getAmount());
               System.out.println("Tax:" +Income.getTax() + "%");
               System.out.println("Total net income:RM" +calculateNetIncome());
               System.out.println("Total tax paid:RM" +Income.getTotalTax());
               }
} 
class Income{
         String incomeType="";
         double amount;
         double tax;
         double totalTax;
         
         Income(String incomeType,double amount, double tax){
            this.incomeType = incomeType;
            this.amount = amount;
            this.tax = tax;
            }
         
         String getIncomeType(){
            return incomeType;
         }
         
         double getAmount(){
            return amount;
         }
         
         double getTax(){
            return tax;
         }
         
         double getTotalTax(){
            totalTax=(tax/100)*amount;
            return totalTax;
            }
           
}
