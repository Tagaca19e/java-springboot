package com.project.payroll;

import com.project.payroll.entities.Employee;
import com.project.payroll.entities.Order;
import com.project.payroll.repositories.EmployeeRepository;
import com.project.payroll.repositories.OrderRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  // This gets executed when the applicatiion runs.
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
    return args -> {
      log.info("Preloading " +
               repository.save(new Employee("Bilbo", "Baggins", "burglar")));
      log.info("Preloading " +
          repository.save(new Employee("Frodo", "Baggins", "thief")));
               
      repository.findAll().forEach(employee -> log.info("Preloaded " + employee));

      orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
      orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

      orderRepository.findAll().forEach(order -> {
        log.info("Preloaded " + order);
      });
    };
  }
}
