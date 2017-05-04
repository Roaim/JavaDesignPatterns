
public class Main {
	
	public static void main(String[] args) {
		
		Name nameRoaim = new Name.Builder()
							.setFName("Roaim")
							.setLName("Hridoy")
							.build();
							
		Address addRoaim = new Address.Builder()
								.setCountry("Bangladesh")
								.setCity("Dhaka")
								.setStreet("Malibagh")
								.build();
								
		Account acRoaim = new Account.Builder()
								.setId(1)
								.setEmail("roaimahmed@gmail.com")
								.setName(nameRoaim)
								.setAddress(addRoaim)
								.build();
								
		System.out.println(acRoaim.toString());
	}
}
