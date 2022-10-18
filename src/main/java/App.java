import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat ex1 = (Cat) applicationContext.getBean("CatBean");
        Cat ex2 = (Cat) applicationContext.getBean("CatBean");

        boolean compare1 = bean == bean2;
        boolean compare2 = ex1 == ex2;
        System.out.println(compare1);
        System.out.println(compare2);


        System.out.println(bean.getMessage());
    }
}