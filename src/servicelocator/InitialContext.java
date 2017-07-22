package servicelocator;

public class InitialContext {
	public Object lookup(String jndiName) {
		if(jndiName.equalsIgnoreCase("SERVICE 1")) {
			System.out.println("Looking up and creating a new Service 1 object");
			return new Service1();
		}
		else if(jndiName.equalsIgnoreCase("SERVICE 2")) {
			System.out.println("Looking up and creating a new Service 2 object");
			return new Service2();
		}
		return null;
	}
}
