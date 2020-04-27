import java.util.*;

class Payment 
{
	private double money;

  public double get() {
    return money;
  }
  public void set(double money) {
    this.money = money;
  }

   void paymentDetails()
   {
	  	System.out.println("the amount of money payment"+money); 
   }

}
class CashPayment extends Payment
{
double money;
	public 	CashPayment(double money)
{
	this.money=money;
}
   void paymentDetails()
   {
	  	System.out.println("the amount of money is on cash ="+money); 
   }
}

class CreditCardPayment extends Payment
{

String name_on_the_card;
int Expiration_date;
long Credit_card_number;
	public 	CreditCardPayment(String name_on_the_card,int Expiration_date,long Credit_card_number)
{
	this.name_on_the_card=name_on_the_card;
	this.Expiration_date=Expiration_date;
	this.Credit_card_number=Credit_card_number;
	
}
   void paymentDetails()
   {
	  	System.out.println("Name on the card= "+name_on_the_card); 
		System.out.println("Expiration_date  on the card= "+Expiration_date); 
		System.out.println("Credit_card_number on the card = "+Credit_card_number); 
			System.out.println(""); 
		
   }
	
	public static void main (String[] args)
	{
		Payment p1=new Payment();
		p1.set(4999);
		
		CashPayment e1=new CashPayment(p1.get());
		e1.paymentDetails();
		CreditCardPayment e2=new CreditCardPayment("pawan nayak",24,234567890123456L);
	    e2.paymentDetails();
		
		p1.set(4129);
		CashPayment e3=new CashPayment(p1.get());
		e3.paymentDetails();
		CreditCardPayment e4=new CreditCardPayment("ashish nayak",90,1234567890123467L);
		e4.paymentDetails();
	}
}
		
		