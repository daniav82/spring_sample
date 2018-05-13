import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Applicarion {

	public static void main(String[] args) {
		CustomerService customer = new CustomerServiceImpl();
		
		System.out.println(customer.findAll().get(0).getFirstname());

	}

}
