package homework2;

public class UserManager {
		public void signUp(User user) {
			System.out.println("Sisteme kay�t ba�ar�l�." + user.getPhoto() + " Id: " + user.getId() + " Ad Soyad: " + user.getFirstName() + " " + user.getLastName());
		}
		public void logIn(User user) {
			System.out.println(user.getPhoto() +  " id'si " + user.getId() + " olan " + user.firstName + " " + user.getLastName() + " sisteme giri� yapt�.");System.out.println();
		}
		public void logOut(User user) {
			System.out.println(user.getPhoto() + " id'si " + user.getId() + " olan " + user.firstName + " " + user.getLastName() + " sistemden ��k�� yapt�.");System.out.println();
		}
		
}
