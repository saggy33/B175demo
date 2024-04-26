package springbootholecrud.holebootcrud.serviceI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootholecrud.holebootcrud.model.Student;
import springbootholecrud.holebootcrud.repo.repo;

        

@Service
public class Studentimp implements ServiceI {
	
	
	@Autowired
	repo ssd;

	@Override
	public void savedata(Student s) {
			
		ssd.save(s);
		
	}

	@Override
	public List<Student> logindata(String username, String password) {
		if (username.equals("admin")&&password.equals("admin")) {
			   List<Student>  list= (List<Student>) ssd.findAll();
			   return list;	   
		}
			   else {
				      
				   
				
				   return ssd.findByUsernameAndPassword(username, password);  
			}
		
		}

	@Override
	public List<Student> deletedata(int id) {
		
	         ssd.deleteById(id);
		return (List<Student>) ssd.findAll();

		
		
		
	}

	@Override
	public Student editstudent(int id) {
                 Optional<Student> op= ssd.findById(id);	
                 
                 if (op.isPresent()) {
                	 
             Student s= op.get();
             return s;
					
				}
                 
                 else {
                	 return null;
				}
				
	}



	@Override
	public List<Student> updatedata(Student s) {
		  ssd.save(s);
		return (List<Student>) ssd.findAll();
	}


		
	}


