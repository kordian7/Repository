package pl.kordian;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

   private static final long serialVersionUID = 1L;

   private String pageId;

   public String moveToPage1(){
      return "page1";
   }

   public String moveToPage2(){
      return "page2";
   }

   public String moveToHome() {
	   return "home";
   }
   
   public String getPageId() {
      return pageId;
   }

   public void setPageId(String pageId) {
      this.pageId = pageId;
   }
}