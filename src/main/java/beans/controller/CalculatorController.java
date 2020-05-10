package beans.controller;

import beans.ICalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CalculatorController {

    @Autowired
    private ICalculator calculator;
    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String displayCalculatorPage() {
        return "calculation";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public ModelAndView operationResult(HttpServletRequest request, HttpServletResponse response) {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int result = calculator.calculate(a,b);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("banana", result);
        return mv;
    }
}
