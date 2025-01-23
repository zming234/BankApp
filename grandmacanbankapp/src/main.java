import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class main {
	

	public static void main(String[] args) {
		
		//創建兩個ArrayList儲存存款帳戶、網路帳戶
		ArrayList<depositAccount> depositAccounts = new ArrayList<depositAccount>();
		ArrayList<internetAccount> internetAccounts = new ArrayList<internetAccount>();
		
		try {
			
			
			File myObj = new File("./src/grandmacanbankappTEXT.text");
			Scanner reader = new Scanner(myObj);
			while(reader.hasNextLine()) {
				int n = 0;
				int m = 0;//n和m是分別記錄資料存在兩個ArrayList(deposiAccounts、internetAccounts)的index 用來使用showInfo()
				String data = reader.nextLine();
				String ch = String.valueOf(data.charAt(14));//因威資料的格式固定 因此可以由此判斷是哪種帳戶
				
				if(ch.equals("存")) {//判斷是存款帳戶
					
					String[] contents = data.split(",");//資料依逗號分開
					String name = contents[0];
					String id  = contents[1];
					String type = contents[2];
					int money = Integer.parseInt(contents[3]);
					
					depositAccounts.add(new depositAccount(name, id, type, money));
					depositAccounts.get(n).showInfo();
					n ++;
					
				}else if(ch.equals("網")) {//判斷是網路帳戶
					String[] contents = data.split(",");//資料依逗號隔開
					String name = contents[0];
					String id = contents[1];
					String type = contents[2];
					int money = Integer.parseInt(contents[3]);
					String account = contents[4];
					String password = contents[5];
					
					internetAccounts.add(new internetAccount(name, id, type, money, account, password));
					internetAccounts.get(m).showInfo();
					m ++;
				}
				
			}
		}catch( FileNotFoundException e) {
			System.out.println("File not found");
		}
		
				
	
		
	}

}
