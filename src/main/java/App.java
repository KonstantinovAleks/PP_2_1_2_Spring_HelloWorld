import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
        HelloWorld beanMy = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        boolean hw = bean == beanMy;
        boolean cat = cat1 == cat2;

        System.out.println("HelloWorld: " + hw); // true
        System.out.println("Cat: " + cat); // false
    }
}
