package oopIntro;

public class Main {

	public static void main(String[] args) {
		Course course1 =new Course(1,"C# + ANGULAR","3 ay sürecek nitelikli yazılım geliştirme kampımız.","Engin DEMİROĞ");
		Course course2 =new Course(2,"Java + REACT","2 ay sürecek nitelikli yazılım geliştirme kampımız.","Engin DEMİROĞ");
		
		Course[] courses = {course1, course2};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		
		System.out.println("-------------------------------------------");
		
		Student student1=new Student(1,"isa","yavuz","isa@gmail.com","123");
		Instructor instructor1=new Instructor(1,"engin","demiroğ","engin@gmail.com","456");
	
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);

	}

}
