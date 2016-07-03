package pl.kordian;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "message", eager = true)
public class Message {
	private String message = "Hello World!!!";
	
	public String getMessage(){
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
