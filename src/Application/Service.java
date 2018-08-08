package Application;
import java.util.HashMap;

public class Service {
	private HashMap<Integer, Account> accountsMap = new HashMap<>();
	private int nextID = 0;
	
	public void addAnItem(String fnam,String lnam, int acc) {
		Account accountObject = new Account(fnam, lnam, acc);
		accountsMap.put(nextID, accountObject);
		nextID++;
	}
	public void removeItem(int removeID) {
		accountsMap.remove(removeID);
	}
	public HashMap<Integer, Account> getAccounts(){
		return accountsMap;	
	}
}
