 package Atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpl implements AtmInterface {
	
	Atm atm=new Atm();
	Map<Double,String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		
		System.out.println("Available Balance is: " +atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {

		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				ministmt.put(withdrawAmount,"Amount withdrawn");
				System.out.println("collect the cash" +withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance!");
			}
		}
		else
		{
			System.out.println("please enter the amount in multipple of 500");
		}
		
	}

	public void depositAmount(double depositedAmount) {
		
		ministmt.put(depositedAmount,"Amount Deposited");
		System.out.println(depositedAmount+ "Deposited Succesfully!");
		atm.setBalance(atm.getBalance()+depositedAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
		
			System.out.println(d+"="+ministmt.get(d));
		}
	}

	@Override
	public void depositAount(double depositeAmount) {
		
	}

}
