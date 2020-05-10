package beans;

import beans.controller.AddOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    public ISecondBean secondBean() {
        ISecondBean secondBean = new SecondBean();
        secondBean.setName("SDA2");
        return secondBean;
    }

    @Bean
    public ICalculator calculator() {
        return new Calculator();
    }

    @Bean
    public IAddOperation addOperation() {
        return new AddOperation2();
    }
}
