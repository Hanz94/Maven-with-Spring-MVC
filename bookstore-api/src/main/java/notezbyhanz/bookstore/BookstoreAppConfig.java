package notezbyhanz.bookstore;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Hanz on 6/21/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "notezbyhanz.bookstore", "notezbyhanz.bookstore.controller" })
public class BookstoreAppConfig
{

}