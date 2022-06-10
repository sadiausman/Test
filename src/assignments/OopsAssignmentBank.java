package assignments;

public  class OopsAssignmentBank  {
	
	public String BankName = "CapitalOneBank";
	public String BankAccount = "1234556789";
	public String CreditJourney = "Journey";
	public String DepositCheck = "Checks";
	public String SendMoney = "Money";
	public String PayBill = "Bills";
	public String PayAndTransfer = "TransferMoney";
	
	//Constructor overloading:
	public OopsAssignmentBank() {
	}
	public OopsAssignmentBank(String BankName,String  BankAccount,String  CreditJourney ,
	String  DepositCheck ,String SendMoney ,String  PayBill ,String  PayAndTransfer ) {
	this.BankName = BankName;
	this.BankAccount = BankAccount;
	this.CreditJourney = CreditJourney;
	this.DepositCheck = DepositCheck;
	this.SendMoney = SendMoney;
	this.PayBill = PayBill;
	this.PayAndTransfer = PayAndTransfer;
	}
	//Encapsulation:
	public void setBankName( String BankName) {
	this.BankName = BankName;	
	}
	public String getBankName() {
		return this.BankName;
	}
	public void setBankAccount( String BankAccount) {
	this.BankAccount = BankAccount;	
	}
	public String getBankAccount() {
		return this.BankAccount;
	}
	public void setCreditJourney( String CreditJourney) {
		this.CreditJourney = CreditJourney;	
	}
	public String getCreditJourney() {
		return this.CreditJourney;
	}
	public void setDepositCheck( String DepositCheck) {
		this.DepositCheck = DepositCheck;	
	}
	public String getDepositCheck() {
		return this.DepositCheck;
	}
	public void setSendMoney( String SendMoney) {
		this.SendMoney = SendMoney;	
	}
	public String getSendMoney() {
		return this.SendMoney;
	}
	public void setPayBill( String PayBill) {
		this. PayBill =  PayBill;	
	}
	public String getPayBill() {
		return this.PayBill;
	}
	public void setPayAndTransfert( String PayAndTransfer) {
		this.PayAndTransfer = PayAndTransfer;	
	}
	public String PayAndTransfer() {
		return this.PayAndTransfer;
	}
	
	//another way of Encapsulation:
	private String Info;
	private String AccountDetails;
	private String StatementsAndDocuments;
	private String AccountUser;
    public void setInfo(String AccountDetails,String StatementsAndDocuments,String AccountUser ){
    this.Info = Info;	
    }
    public String getInfo() {
    String Info = getInfo();
    String Detail = Info.concat(AccountDetails + StatementsAndDocuments + AccountUser);
	return Info;
    }
	public static void main(String[] args) {
		
	
}
}
