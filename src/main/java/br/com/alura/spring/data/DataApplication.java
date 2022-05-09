package br.com.alura.spring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@SpringBootApplication
public class DataApplication implements CommandLineRunner{
	
	private final CargoRepository repository;
	
	public DataApplication(CargoRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
		
		repository.save(cargo);
	}
}
