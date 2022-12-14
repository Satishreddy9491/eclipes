package package1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPackage1 {
	public static void main(String args[]) {
		Resource resource=new ClassPathResource("beans.xml");
		
		BeanFactory factory =new XmlBeanFactory(resource);
		
		Question question=(Question)factory.getBean("question"); 
		
		question.displayInfo();
	}
}
