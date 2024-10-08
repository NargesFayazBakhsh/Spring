package ir.freeland.spring.initialspring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationFiledInjection {
  @Autowired
  private Calculator calculator;
  
  @Autowired
  private Display display;
  
  @Autowired
  private Print print;

  public void complexCalculation() {
    int result = calculator.plus(2, 3);

    display.output(String.format("2 + 3 = %d", result));
    print.output(String.format("2 + 3 = %d", result));
   }

}
