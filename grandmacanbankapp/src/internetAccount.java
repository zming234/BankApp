
public class internetAccount extends bank  implements interestRate{
	private String account;
	private String onlineAccount;
	private String onlinePassword;
	private double interestRate;
	
	public internetAccount(String name, String id, String type, int initialAmount, String accountName, String password) {
		super(name, id, type, initialAmount);
		this.onlineAccount = accountName;
		this.onlinePassword = password;
		this.account = generateAccount();
	}
	
	private String generateAccount() {
		
		String ac = "2" + getId().substring(8,10) + getUnsameFiveNum() + getRandomThreeNum();
		return ac;
		
	}
	
	public double interestRate() {
		return getBasicInterestRate() - 0.2;

	}
	
	public void showInfo() {
		System.out.printf("姓名:%s 身分證字號:%s 餘額:%d\n帳號號碼:%s\n存款利率:%.1d\n帳戶類型:%s\n網銀帳號:%s 密碼:%s", getName(), getId(), getInitialAmount(), account, interestRate, getType(), onlineAccount, onlinePassword);
	}
}
