package Employee;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]) {
        Resource r=new ClassPathResource("beans.xml"); 
		BeanFactory factory=new XmlBeanFactory(r);  
		Address employeeAddress =(Address)factory.getBean("a1");
		Details employeeDetails =(Details)factory.getBean("e");
		
		employeeDetails.show();	
       
        }
}
