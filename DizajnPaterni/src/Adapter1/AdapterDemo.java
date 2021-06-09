package Adapter1;

public class AdapterDemo {
public static void main(String[] args) {
	
	CreditCard bank = new BankCustomer();
	CreditCard cas = new CasinoCustomer();
CardMethods(bank);
CardMethods(cas);

}
public static void CardMethods(CreditCard card) {
	System.out.println(" ");
	System.out.println(card.getCreditCard());
}
}
