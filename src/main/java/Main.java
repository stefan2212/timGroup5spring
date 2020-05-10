import beans.FirstBean;
import beans.ISecondBean;
import beans.SecondBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        FirstBean bean = (FirstBean) context.getBean("firstBean");
        ISecondBean secondBean = (ISecondBean) context.getBean("secondBean");
        System.out.println("Hello " + bean.sayHelloFromSecondBean());
        System.out.println(secondBean.getName());


    }
}
