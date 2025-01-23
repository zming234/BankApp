import java.util.ArrayList;
import java.util.Random;

public class bank {
	private  String name;
 	private String id;
	private String type;
	private int initialAmount;
	private double basicInterestRate;
	
	public bank(String name, String id,String type, int initialAmount) {
		this.name = name;
		this.id = id;
		this.initialAmount = initialAmount;		
		basicInterestRate = 2.5;
	}
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	public int getInitialAmount() {
		return initialAmount;
	}
	
	public void depositMoney(int money) {
		initialAmount += money;
	}
	
	public void withdrawMoney(int money) {
		initialAmount -= money;
	}
	
	//創立五個不重複的數 概念:從0~9的陣列隨機取出數字再將取出的數字從陣列中刪除 重複五次
	public String getUnsameFiveNum() {
		
		//創建有0~9的陣列
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 10; i++ ) {
			nums.add(i);
		}
	
		Random random = new Random();
		String unsameFiveNum = "";
		for(int i = 0; i < 5; i++) {
			
			int  randomIndex = random.nextInt(nums.size());
			int selectNum = nums.get(randomIndex);
			unsameFiveNum += selectNum;
			nums.remove(randomIndex);
		}
		
		return unsameFiveNum;
	}
	
	public String getRandomThreeNum() {
		
		Random random = new Random();
		String randomThrees = "";
		
		for (int i = 0; i < 3; i++) {
			int randomThree = random.nextInt();
			randomThrees += String.valueOf(randomThree);
		}
		
		return randomThrees;
	}
	
	public String getRandomFiveNum() {
		
		Random random = new Random();
		String randomThrees = "";
		
		for (int i = 0; i < 5; i++) {
			int randomThree = random.nextInt();
			randomThrees += String.valueOf(randomThree);
		}
		
		return randomThrees;
		
	}
	
	public double getBasicInterestRate() {
		return basicInterestRate;
	}
	

}
