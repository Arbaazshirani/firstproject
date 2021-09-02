package com.py.lenovo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LenovoApplication {

	public static void main(String[] args) {

		//ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(LenovoApplication.class, args);
		/*UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);
		CompanyRepository companyRepository = configurableApplicationContext.getBean(CompanyRepository.class);

		Company company = new Company("Lenovo", "Sector 35");
		companyRepository.save(company);

		User user = new User("Aarbaz Shirani", 25, 9876543210L, new Date("1996-08-12"), false, company);
		userRepository.save(user);*/

	}

}
