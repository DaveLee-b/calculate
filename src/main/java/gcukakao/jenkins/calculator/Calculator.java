package gcukakao.jenkins.calculator; 
import org.springframework.stereotype.Service;

@Service
public class Calculator {
     public int sum(int a, int b) {
          System.out.println("201935091 이동석");
          return a + b;
     }
     public int sub(int a, int b) {
          return a -  b;
     }
     public int mul(int a, int b) {
          return a * b;
     }
     public int div(int a, int b) {
          return a / b;
     }
}



