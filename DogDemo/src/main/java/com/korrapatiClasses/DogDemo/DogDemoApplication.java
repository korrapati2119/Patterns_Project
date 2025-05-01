package com.korrapatiClasses.DogDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DogDemoApplication.class, args);
		System.out.println("Welcome to Spring boot..!!");
		
		Dog d1 = appContext.getBean(Dog.class);
		Trainer t1 = appContext.getBean(Trainer.class);
		t1.setId(11);
		t1.setName("TraineOne");
		System.out.println(d1);
		d1.setId(1);
		d1.setName("Puppy");
		d1.setBreed("Pug");
		d1.setTrainer(t1);
		System.out.println(d1);
		
		Dog d2 = appContext.getBean(Dog.class);
		System.out.println(d2);
		d2.setId(2);
		d2.setName("Puppy");
		d2.setBreed("Pug");
		d2.setTrainer(t1);
		System.out.println(d2);
		//System.out.println(d1);
		}
}
