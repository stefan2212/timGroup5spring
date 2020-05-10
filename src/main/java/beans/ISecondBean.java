package beans;

import org.springframework.stereotype.Service;

@Service("secondBean")
public interface ISecondBean {
    void setName(String name);
    String getName();
}
