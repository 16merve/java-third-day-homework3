package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			System.out.println("Kursun fiyatı 0 dan küçük olamaz!");
		}

	}

	List<String> CourseNames = new ArrayList<String>();

	public void add1(Course course) throws Exception {
		for (String courseName : CourseNames) {
			if (courseName == course.getName()) {
				System.out.println("Kurs ismi tekrar edemez!");
			}
			CourseDao courseDao = new JdbcCourseDao();
			courseDao.add(course);

			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}

	}
   
   
}
  
