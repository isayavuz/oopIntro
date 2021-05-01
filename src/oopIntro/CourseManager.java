package oopIntro;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.name+" eklendi.");
	}
	
	public void delete(Course course) {
		System.out.println(course.name+" silindi");
	}
	
	public void update(Course course) {
		System.out.println(course.name+" güncellendi");
	}

}
