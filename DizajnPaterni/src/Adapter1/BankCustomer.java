package Adapter1;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		setAccHolderName("Tea Grombanovska");
		setBankName("Komercijalna");
		setAccNumber(12355285);
		
	}

	@Override
	public String getCreditCard() {
		String creditcard = getAccHolderName()+ " "+ getAccNumber();
		return creditcard;
	}

	
	
}
