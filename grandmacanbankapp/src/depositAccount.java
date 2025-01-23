
public class depositAccount extends bank implements interestRate{
	private String account;
	private String finCardAccount;
	private String finCardPassword;//安全碼
	private double interestRate;
	
	public depositAccount(String name, String id,String type, int initialAmount ) {
		super(name, id, type, initialAmount);
		this.account = generateAccount();
		this.finCardAccount = generateFinCardAccount();
		this.finCardPassword = generateFinCardPassword();
	}
	
	private String generateAccount() {
		
		String ac = "1" + getId().substring(8,10) + getUnsameFiveNum() + getRandomThreeNum();
		return ac;		
	}
	
	private String generateFinCardAccount() {
		
		String ca = getRandomFiveNum() + getUnsameFiveNum() +getRandomFiveNum();
		return ca;
	}
	
	private String generateFinCardPassword() {
		
		String cp = getRandomThreeNum();
		return cp;
	}
	
	public double interestRate() {
		return getBasicInterestRate() + 0.2;
	}
	
	public void showInfo() {
		System.out.printf("姓名:%s 身分證字號:%s 餘額:%d\n帳號號碼:%s\n存款利率:%.1f\n帳戶類型:%s\n卡號:%s 安全碼:%s", getName(), getId(), getInitialAmount(), account, interestRate, getType(), finCardAccount, finCardPassword);
	}
}
