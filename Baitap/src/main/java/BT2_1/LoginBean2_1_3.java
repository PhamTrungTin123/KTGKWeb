package BT2_1;

public class LoginBean2_1_3 {
	 private String name, password;
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public String getPassword() {
	        return password;
	    }
	 
	    public void setPassword(String password) {
	        this.password = password;
	    }
	 
	    public boolean validate() {
	        if ("admin".equals(password)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
