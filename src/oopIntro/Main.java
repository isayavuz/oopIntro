package oopIntro;

public class Main {

	public static void main(String[] args) {
		Course course1 =new Course(1,"C# + ANGULAR","3 ay s�recek nitelikli yaz�l�m geli�tirme kamp�m�z.","Engin DEM�RO�");
		Course course2 =new Course(2,"Java + REACT","2 ay s�recek nitelikli yaz�l�m geli�tirme kamp�m�z.","Engin DEM�RO�");
		
		Course[] courses = {course1, course2};
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);

	}

}
