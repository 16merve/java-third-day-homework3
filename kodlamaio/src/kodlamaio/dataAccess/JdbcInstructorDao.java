package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
