package autoWaring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext res=new ClassPathXmlApplicationContext("beans.xml");
		ReferenceOfByName autowaringReference=res.getBean("referenceofbyname",ReferenceOfByName.class);
		autowaringReference.disply();
	}
}
