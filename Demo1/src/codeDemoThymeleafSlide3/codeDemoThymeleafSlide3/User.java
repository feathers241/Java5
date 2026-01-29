package poly.edu.teach.learnThymeleaf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
	String username;
	String password;	
	
	public static void main(String[] args) {
		User u = new User("a", "b");
		System.out.println(u.getUsername());
	}

}
