package OEMEntities;

import javax.persistence.*;

@Entity
public class LoginMaster {
	@Id
	private String lid;
	private String password;
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
