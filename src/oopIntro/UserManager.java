package oopIntro;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName+" eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.firstName+" silindi.");
	}
	public void update(User user) {
		System.out.println(user.firstName+" güncellendi.");
	}
}
