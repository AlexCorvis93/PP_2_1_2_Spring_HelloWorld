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

        System.out.println(bean.equals(bean2));
        System.out.println(ex1.equals(ex2));


        System.out.println(bean.getMessage());
    }
}