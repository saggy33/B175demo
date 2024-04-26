package springbootholecrud.holebootcrud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springbootholecrud.holebootcrud.model.Student;



@Repository
public interface repo  extends  CrudRepository<Student, Object>{ 
	
	public List<Student>findByUsernameAndPassword(String usernamer,String password);

}
