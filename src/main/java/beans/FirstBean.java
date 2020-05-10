package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("firstBean")
public class FirstBean {

    @Autowired
    private ISecondBean secondBean;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHelloFromSecondBean() {
        return secondBean.getName();
    }
}
