package fi.haagahelia.car.carstock;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.car.carstock.domain.Car;
import fi.haagahelia.car.carstock.domain.CarRepository;

@SpringBootApplication
public class CarstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarstockApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CarRepository repository) {
		return (args) -> {
			repository.save(new Car("Ford", "Modeo", "Red", "Diesel", 2013));
			repository.save(new Car("Alfa Romeo", "Spider", "Black", "B98", 2016));
			repository.save(new Car("Mersedes-Benz", "180", "Silver", "Diesel", 2011));
			repository.save(new Car("Mersedes-Benz", "A", "Red", "A95", 2017));
			repository.save(new Car("Audi", "A3", "Black", "A95", 2014));
			repository.save(new Car("Toyota", "Auris", "Black", "A95", 2013));
			repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2015));
			repository.save(new Car("Nissan", "Micra", "", "A95", 2015));
			repository.save(new Car("Nissan", "X-Trail", "Blue", "Diesel", 2016));
		};
	}

}
