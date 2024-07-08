package com.spring.core.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student{
    private Address address;

    public Student(Address address){
        this.address = address;
    }

    public void print(){
        System.out.println("Student class method is called");
        address.print();
    }

    public void init(){
        System.out.println("Initialization logic");
    }
    public void destroy(){
        System.out.println("Destruction logic");
    }
}

class Address{
    public void print(){
        System.out.println("Address class method is called");
    }
}

@Configuration
class AppConfig{

    @Bean(name = {"addressBean", "addressDemo"})
    public Address address(){
        return new Address();
    }

    @Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
    public Student student(){
        return new Student(address());
    }
}
public class BeanAnnonationDemo {
    public static void main(String[] args) {
        try(var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)){
        // Student student = applicationContext.getBean(Student.class);  //method class name
        Student student = (Student) applicationContext.getBean("studentBean"); //method name

        String[] listBean = applicationContext.getBeanDefinitionNames();
        for(String bean: listBean){
            System.out.println(bean);
        }
        student.print();
        }
        

        // Address address = applicationContext.getBean(Address.class);
        // address.print();
    }

}
