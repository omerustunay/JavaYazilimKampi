package yazilimKampigun2;

public class UserManager {

	
	
	public void DataOperations() {
		
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("omer");
		user1.setSurname("ustunay");
		user1.setEmail("omerustunay@gmail.com");
		user1.setPassword("123");
		
		User user2 = new User(2, "omer1","ustunay1","omerustunay@gmail.com2","1234");
		
		
		Course course1 = new Course(1,user1.getId(),"java+react kursu");
		Course course2 = new Course(2, user2.getId(), "C#+Angular kursu");
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.print(course.getName()+ " - "+ course.getUserId() + "\n");
		}
		
	}
}
