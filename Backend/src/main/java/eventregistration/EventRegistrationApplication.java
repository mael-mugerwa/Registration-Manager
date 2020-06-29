package eventregistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import view.ComputationPage;

@RestController
@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EventRegistrationApplication.class, args);
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComputationPage().setVisible(true);
            }
        });
	}
/*
  @RequestMapping("/")
  public String greeting(){
    return "Hello world!";
  }
  */
}