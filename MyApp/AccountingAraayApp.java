

public class AccountingAraayApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply*VatRate;
		double Total = ValueOfSupply +vat;
		double Expense = ValueOfSupply*expenseRate;
		double Income = ValueOfSupply-Expense;
		
		
		
		double [] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		double Dividend1 = Income * dividendRates[0];
		double Dividend2 = Income * dividendRates[1];
		double Dividend3 = Income * dividendRates[2];
		
		
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
