package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.InstructorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.HibernateInstructorDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	  Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
     Instructor instructor = new Instructor();
    	 instructor.setId(1);
    	 instructor.setName("Engin");
     InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
     instructorManager.add(instructor);
     
     Category category = new Category();
         category.setId(1);
         category.setName("Programlama"); 
     CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
     categoryManager.add(category);
     
     Course course = new Course();
        course.setId(1);
        course.setName("Yazılım Geliştirici Kampı (JAVA)");
        course.setCategory("Programlama");
        course.setInsturctor("Engin Demiroğ");
        course.setPrice(100);
     CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);
     
     
	}
}
