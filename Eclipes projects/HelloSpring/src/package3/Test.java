package package3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		Resource resour=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(resour);

		Question questi=(Question)factory.getBean("questi");
		questi.displayInfo();
		
	}
}