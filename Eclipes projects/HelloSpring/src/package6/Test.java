package package6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("beans.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Employee employeDe=(Employee)factory.getBean("ob");  
    employeDe.dispalyInfo();  
      
}  
}  
