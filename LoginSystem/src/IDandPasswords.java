import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		logininfo.put("Bro", "123");
		logininfo.put("king", "password");
		logininfo.put("raj", "abc123");
	}
	
	protected HashMap<String, String> getLoginInfo(){
		return logininfo;
	}
	
}
