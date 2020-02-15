import javax.swing.JOptionPane;

public class AccountingApp {

	public static void main(String[] args) {
		(args[0]) = JOptionPane.showInputDialog("Enter a ValueOfSupply");
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double Total = ValueOfSupply +vat;
		double Expense = ValueOfSupply*expenseRate;
		double Income = ValueOfSupply-Expense;
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		if(Income > 10000.0) {
		Dividend1 = Income*0.5;
		Dividend2 = Income*0.3;
		Dividend3 = Income*0.2;
		} else {
			Dividend1 = Income*1;
			Dividend2 = Income*0;
			Dividend3 = Income*0;
		}
		
		
		System.out.println("Value of supply: " +ValueOfSupply);
		System.out.println("VAT :" + vat);
		System.out.println("Total :" + Total);		
		System.out.println("Expense :" + Expense);	
		System.out.println("Income :" + Income);	
		System.out.println("Dividend1 :" + Dividend1);	
		System.out.println("Dividend2 :" + Dividend2);	
		System.out.println("Dividend3 :" + Dividend3);
		


	}
}
