package ru.maximserver.denebola;

import org.springframework.boot.SpringApplication;

public class TestDenebolaApplication {

	public static void main(String[] args) {
		SpringApplication.from(DenebolaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
