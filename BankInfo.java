package week3.day1;


//Assignment3:
//============
//    Class     :BankInfo
//    Methods :saving(),fixed(),deposit()
//
//     Class     :AxisBank
//     Methods :deposit()
//
//Description:
//You have to override the method deposit in AxisBank.


public class BankInfo 
{
	public void saving()
	{
		System.out.println("This is a savings account");
	}
	public void fixed()
	{
		System.out.println("This is a fixed deposit account");
	}
	public void deposit(int amt)
	{
		System.out.println("Super class - Amount credited: "+amt);
	}
}
