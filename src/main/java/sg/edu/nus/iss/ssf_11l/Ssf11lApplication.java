package sg.edu.nus.iss.ssf_11l;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class Ssf11lApplication {

    @Bean
    CommonsRequestLoggingFilter log() {
		CommonsRequestLoggingFilter logger = new CommonsRequestLoggingFilter();
		logger.setIncludeClientInfo(true); //Include client address and session ID
		logger.setIncludeQueryString(true);
		return logger;
	}

	public static void main(String[] args) {
		// SpringApplication.run(Ssf11lApplication.class, args);
		SpringApplication app = new SpringApplication(Ssf11lApplication.class);
		String port = "8080";
		ApplicationArguments argsOptions = new DefaultApplicationArguments(args);

		if (argsOptions.containsOption("port"))
			port = argsOptions.getOptionValues("port").get(0);
		
		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		System.out.println("Application running on port " + port);

		String f = "";
		if (argsOptions.containsOption("file")) {
			f = argsOptions.getOptionValues("file").get(0);
			System.out.println("File: " + f);
		}
		
		
		
		app.run(args);
	}

}
