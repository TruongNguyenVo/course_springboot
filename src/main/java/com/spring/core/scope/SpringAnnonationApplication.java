package com.spring.core.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAnnonationApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(SpringAnnonationApplication.class,args);
        
        SingletonBean singletonBean1 = configurableApplicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean1.hashCode());
        SingletonBean singletonBean2 = configurableApplicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean2.hashCode());
        SingletonBean singletonBean3 = configurableApplicationContext.getBean(SingletonBean.class);
        System.out.println(singletonBean3.hashCode());

        PrototypeBean prototypeBean1 = configurableApplicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.hashCode());
        PrototypeBean prototypeBean2 = configurableApplicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.hashCode());
        PrototypeBean prototypeBean3 = configurableApplicationContext.getBean(PrototypeBean.class);
        System.out.println(prototypeBean3.hashCode());





    }
}
