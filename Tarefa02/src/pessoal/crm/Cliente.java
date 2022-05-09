package pessoal.crm;

import pessoal.marketing.Digital;

public class Cliente extends Digital {
private String email;
private String fone;

public String getEmail() {
	return email;
}
public String getFone() {
	return fone;
}
public void setEmail(String email) {
	this.email = email;
}
public void setFone(String fone) {
	this.fone = fone;
}


}
