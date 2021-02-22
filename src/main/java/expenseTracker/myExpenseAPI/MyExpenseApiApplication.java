package expenseTracker.myExpenseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import expenseTracker.myExpenseAPI.filters.AuthFilter;

@SpringBootApplication
public class MyExpenseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyExpenseApiApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<AuthFilter> filterRegistrationBean() {
		FilterRegistrationBean<AuthFilter> registrationBean = new FilterRegistrationBean<>();
		AuthFilter authFilter = new AuthFilter();
		registrationBean.setFilter(authFilter);
		registrationBean.addUrlPatterns("/et/api/categories/*");
		return registrationBean;
	}

}
