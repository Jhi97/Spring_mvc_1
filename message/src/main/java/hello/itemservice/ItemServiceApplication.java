package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);


		//메시지 관리 기능 (MessageSource) - 직접 등록
		/*@Bean
		public MessageSource messageSource() {
			ResourceBundleMessageSource messageSource = new
					ResourceBundleMessageSource();
			messageSource.setBasenames("messages", "errors");
			messageSource.setDefaultEncoding("utf-8");
			return messageSource;
		}*/
	}

}
