package springbootholecrud.holebootcrud.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springbootholecrud.holebootcrud.model.Student;
import springbootholecrud.holebootcrud.serviceI.ServiceI;


    

@Controller
public class Homecontroller {

	
	    @Autowired
	    ServiceI ssi;
	
	@RequestMapping("/")
	public String login () {
		
		return "login";
		
		
	}
	@RequestMapping("/regi")
	public String regi() {
		return "regi";
		
		
	}
@RequestMapping("/save")
	public String savedata(@ModelAttribute Student s,Model m) {
	     ssi.savedata(s);
	
		return "success";
			
	}
@RequestMapping("/login")
public String logagain() {
	return "login";
		
}
@RequestMapping("/log")
public String logindata(@RequestParam String username,@RequestParam String password,Model m) {
	
	    List<Student>    list =ssi.logindata(username,password);
	
	      if (!list.isEmpty()) {
	    	  m.addAttribute("data", list);
	    	 
	    	  return "success";		
		}
	      else {
	    	  
	    	  return "login";
		}	      
		
	
}
 
@RequestMapping("/delete")
public String delete( @RequestParam int id,Model m) {
	
	     List<Student> list= ssi.deletedata(id);
	     
	        m.addAttribute("data", list);
	        
	return "success";
	
	
	
	
}
 @RequestMapping("/edit")         
public String edituser(@RequestParam int id,Model m){
	 
Student s	=   ssi.editstudent(id);
	 
	 m.addAttribute("s", s);
	return "edit";
	

}


 @RequestMapping("/update")
 public String update (@ModelAttribute Student s,Model m) {
	        
	  List<Student>    l  = ssi.updatedata(s);
	           m.addAttribute("data", l);
	     
	return null;
	 
	 
	 
 }















	
}
