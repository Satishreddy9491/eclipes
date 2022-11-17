package package4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
		Resource reso=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(reso);
		 
		Employee employeeTest=(Employee)factory.getBean("employeeTest");
		employeeTest.show();
	} 
}
