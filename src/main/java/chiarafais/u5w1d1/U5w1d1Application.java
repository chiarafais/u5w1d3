package chiarafais.u5w1d1;

import chiarafais.u5w1d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5w1d1Application.class);

		Menu menuPizzeria = (Menu) context.getBean("Menu");
		System.out.println(menuPizzeria);

		SpringApplication.run(U5w1d1Application.class, args);


	}
}
