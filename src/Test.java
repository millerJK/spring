import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceImpl userService = context.getBean("id_userService", UserServiceImpl.class);
        boolean login = userService.login("xiaomi", "pass");
        System.out.println("login = " + login);

        Teacher teacher = (Teacher) context.getBean("id_teacher");
        System.out.println("teacher = " + teacher.toString());
    }
}
