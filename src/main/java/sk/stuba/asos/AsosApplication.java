package sk.stuba.asos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import sk.stuba.asos.controllers.AccommodationController;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class AsosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsosApplication.class, args);
    }


}
