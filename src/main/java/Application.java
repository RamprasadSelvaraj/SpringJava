import com.spring1.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String... args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = applicationContext.getBean("customerService",  CustomerService.class);
        System.out.println(customerService);
        System.out.println(customerService.getInfo().get(0).getFirstName() + " " + customerService.getInfo().get(0).getLastName());
        /*CustomerService customerService1 = applicationContext.getBean("customerService",  CustomerService.class);
        System.out.println(customerService1);*/
    }
}
