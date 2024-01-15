package com.aadi_interview_prep;

import com.aadi_interview_prep.config.DataSourceConfig;
import com.aadi_interview_prep.scope.SingletonBean;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,AopAutoConfiguration.class})
@SpringBootApplication
@EnableFeignClients
public class InterviewQaApplication implements CommandLineRunner {

    @Value("${discount.offer.price}")
    private int discountPrice;


    @Autowired
    private Environment environment;

    @Autowired
    private DataSourceConfig config;


    @PostConstruct
    public void initLogic() {
        System.out.println("PostConstruct logic executed ...!");
        //connection pool logic
        //kafka producer/consumer instantiate
        //data shedding
        //external API call
    }


    public static void main(String[] args) {
        //ConfigurableApplicationContext context =
        System.out.println("SpringApplication run() method ....... executed");
        ConfigurableApplicationContext context = SpringApplication.run(InterviewQaApplication.class, args);
        //OrderService service = context.getBean("orderService", OrderService.class);
        // service.test();

//        Scope scope = new CustomThreadScope();
//        context.getBeanFactory().registerScope("threadScope", scope);
//
//        Runnable childThread = () -> {
//            Volunteer v1 = context.getBean(Volunteer.class);
//            Volunteer v2 = context.getBean(Volunteer.class);
//            System.out.println("Hashcode of two object created by child thread " + v1.hashCode() + " & " + v2.hashCode());
//        };
//        new Thread(childThread).start();

        // This code will be executed by main thread
//        Volunteer v1 = context.getBean(Volunteer.class);
//        Volunteer v2 = context.getBean(Volunteer.class);
//        System.out.println("Hashcode of two object created by main thread " + v1.hashCode() + " & " + v2.hashCode());
//
////
////
        SingletonBean sb1 = context.getBean(SingletonBean.class);
        SingletonBean sb2 = context.getBean(SingletonBean.class);
        System.out.println(sb1.getProtoTypeBean().hashCode()+" - "+sb2.getProtoTypeBean().hashCode());

//        BeanScopeTestService service1=context.getBean(BeanScopeTestService.class);
//        BeanScopeTestService service2=context.getBean(BeanScopeTestService.class);
//        BeanScopeTestService service3=context.getBean(BeanScopeTestService.class);

    }

    @Override
    public void run(String... args) throws Exception {
        //DB connection
        //populate some data to the db
        // pre-processing logic you want to perform
        // System.out.println("DISCOUNT PRICE :  "+environment.getProperty("discount.offer.price"));

        System.out.println("DISCOUNT PRICE :  " + discountPrice);
        System.out.println("Environment variable :  " + environment.getProperty("spring.profiles.active"));
        System.out.println("CONFIG VALUE : " + config);
        System.out.println("CommandLineRunner run() method ....... executed");

    }
}
