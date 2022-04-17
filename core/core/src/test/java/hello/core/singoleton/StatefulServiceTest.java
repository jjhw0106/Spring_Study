package hello.core.singoleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);


        // 무상태 설계
        //ThreadA : A사용자가 10000원 주문
        int userAPrice = statefulService1.order("사용자A",10000);
        //ThreadB : B사용자가 20000원 주문
        int userBPrice = statefulService2.order("사용자B", 20000);

        assertThat(userAPrice).isNotSameAs(userBPrice);


/*        무상태 설계x
//        System.out.println(statefulService1.getPrice());
//        System.out.println(statefulService2.getPrice());
//        Assertions.assertThat(statefulService1.getPrice() == 10000);

//        //ThreadA : A사용자가 10000원 주문
//        statefulService1.order("사용자A",10000);
//        //ThreadB : B사용자가 20000원 주문
//        statefulService2.order("사용자B",20000);
         */
    }

    static class TestConfig{
        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }
}