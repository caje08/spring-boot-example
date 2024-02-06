package com.csapp;

import com.csapp.customer.Customer;
import com.csapp.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //System.out.println(customers);
        /* Never do This
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);
        */
      //  ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);
      //  printBeans(applicationContext);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {

        return args -> {

            Customer alex = new Customer(
                    "Alex",
                    "alex@gmail.com",
                    21
            );

            Customer jamila = new Customer(
                    "Jamila",
                    "jamila@gmail.com",
                    19
            );
            List<Customer> customers = List.of(alex, jamila);
            customerRepository.saveAll(customers);
        };
    }
/*
    @Bean("newfoo")
    public Foo getFoo(){
        return new Foo("bar");
    }
    record Foo(String name){}
    private static void printBeans(ConfigurableApplicationContext ctx) {
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }*/
}

