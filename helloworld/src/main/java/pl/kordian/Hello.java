package pl.kordian;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "Hello", eager = true)
@RequestScoped
public class Hello {

	@ManagedProperty(value="#{message}")
	private Message messageBean;
	
	private String message;
	
   public Hello() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      if(messageBean != null) {
    	  message = messageBean.getMessage();
   		}
   return message;
	}
   public void setMessageBean(Message message){
	   this.messageBean = message;
   }
}