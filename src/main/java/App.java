import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean0 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean0 == bean1);

        Cat catBean0 =
                (Cat) applicationContext.getBean("cat");

        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(catBean0 == catBean1);
    }
}