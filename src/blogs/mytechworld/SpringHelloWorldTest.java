package blogs.mytechworld;

import java.util.Map;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

public class SpringHelloWorldTest {

	public static void main(String[] args) {

		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"SpringHelloWorld.xml"));

		SpringHelloWorld myBean = (SpringHelloWorld) beanFactory
				.getBean("bean1");
		myBean.helloWorld();

	}

}
