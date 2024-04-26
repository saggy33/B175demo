package springbootholecrud.holebootcrud.serviceI;

import java.util.List;

import springbootholecrud.holebootcrud.model.Student;

public interface ServiceI {
	
	public void savedata(Student s);
	
	public List<Student> logindata(String username,String password);
	
	public List<Student> deletedata(int id);
	
	public Student editstudent( int id);
	
	public List<Student> updatedata(Student s);


}
