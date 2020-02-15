import javax.swing.JOptionPane;

public class AccountingAraayLoopApp {

	public static void main(String[] args) {
		
		(args[0]) = JOptionPane.showInputDialog("Enter a ValueOfSupply");
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double Total = ValueOfSupply +vat;
		double Expense = ValueOfSupply*expenseRate;
		double Income = ValueOfSupply-Expense;
		
		
		
		
		
		
		System.out.println("Value of supply: " +ValueOfSupply);
		System.out.println("VAT :" + vat);
		System.out.println("Total :" + Total);		
		System.out.println("Expense :" + Expense);	
		System.out.println("Income :" + Income);	
		
		

		double [] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		

		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("dividend 1 :" + (Income*dividendRates[i]));
			i = i +1;
		}
	}
}
