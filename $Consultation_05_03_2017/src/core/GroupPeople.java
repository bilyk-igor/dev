package core;


public class GroupPeople {

	private int money;
	
	private President president = new President();
	
	public void groupStealMoney(int moneyIncome){
		president.setMoney(moneyIncome / 3);
		moneyIncome = moneyIncome / 3;
		
		this.money = moneyIncome;
		president.stealMoney();
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public President getPresident() {
		return president;
	}

	public void setPresident(President president) {
		this.president = president;
	}
	
	
	
	
}
