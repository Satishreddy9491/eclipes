package package2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		Resource reso= new ClassPathResource("beans.xml");
		
		BeanFactory factory=new XmlBeanFactory(reso);
		Question questioN=(Question)factory.getBean("questioN");
		questioN.displayInfo();
		
	}
}
