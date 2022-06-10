package assignments;

public class Bank1 extends  OopsAssignmentBank {

	 public static void main(String[] args) {
	 
	 OopsAssignmentBank Bank = new OopsAssignmentBank();
	 System.out.println(Bank.BankName);
	 System.out.println(Bank.BankAccount);
	 System.out.println(Bank.CreditJourney);
	 System.out.println(Bank.DepositCheck);
	 System.out.println(Bank.SendMoney);
	 System.out.println(Bank.PayBill);
	 System.out.println(Bank.PayAndTransfer);
	 
	 System.out.println("----------------------");
	 //Return type method
	 Bank.setBankName("Bank Of America");
	 System.out.println(Bank.BankName);
     
	 Bank.setBankAccount("Add Account");
	 System.out.println(Bank.BankAccount);
	 
	 Bank.setCreditJourney("Add Credit");
	 System.out.println(Bank.CreditJourney);
	 
	 Bank.setDepositCheck("Add DepositChecks");
	 System.out.println(Bank.DepositCheck);
		

	 Bank.setSendMoney("Add Money");
	 System.out.println(Bank.SendMoney);
		

	 Bank.setPayBill("Add Bill");
	 System.out.println(Bank.PayBill);
		

	 Bank.setPayAndTransfert("Add TransferPayment");
	 System.out.println(Bank.PayAndTransfer);
	 System.out.println("-------------");
	 
	//Encapsulation:
	 OopsAssignmentBank bb = new OopsAssignmentBank();
	 System.out.println(bb.BankName);
     System.out.println(bb.BankAccount);
	 System.out.println(bb.CreditJourney);
	 System.out.println(bb.DepositCheck);
	 System.out.println(bb.SendMoney);
	 System.out.println(bb.PayBill);
	 System.out.println(bb.PayAndTransfer);
	 

	 }
}
