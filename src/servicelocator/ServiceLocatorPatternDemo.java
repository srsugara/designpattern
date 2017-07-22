package servicelocator;

public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service 1");
		service.execute();
		service = ServiceLocator.getService("Service 2");
		service.execute();
		service = ServiceLocator.getService("Service 1");
		service.execute();
		service = ServiceLocator.getService("Service 2");
		service.execute();
	}
}
