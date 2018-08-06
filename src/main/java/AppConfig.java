import com.spring1.repository.CustomerRepository;
import com.spring1.repository.CustomerRepositoryImpl;
import com.spring1.service.CustomerService;
import com.spring1.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.spring1"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    /*@Bean(name= "customerService")
    public CustomerService getCustomerService(){
       CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
       //customerService.setCustomerRepository(getCustomerRepository());
       return new CustomerServiceImpl();
    }

    @Bean(name="customerRepository")
    public CustomerRepository getCustomerRepository(){
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        return customerRepository;
    }*/
}
