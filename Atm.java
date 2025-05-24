package Atm;

public class Atm {
private double balance;
private double depositAmount;
private double withdrawAmoun;
public Atm() {
	super();
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}
public double getWithdrawAmoun() {
	return withdrawAmoun;
}
public void setWithdrawAmoun(double withdrawAmoun) {
	this.withdrawAmoun = withdrawAmoun;
}
@Override
public String toString() {
	return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmoun=" + withdrawAmoun + "]";
}

}
