package beans;

import org.springframework.stereotype.Service;

@Service("addBean")
public interface IAddOperation {
     int calculate(int a,int b);
}
