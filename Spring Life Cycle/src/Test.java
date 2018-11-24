
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class Test {

	public static void main(String[] args) {
		System.out.println("hi");
		// TODO Auto-generated method stub
AbstractApplicationContext a=new ClassPathXmlApplicationContext("spring.xml");
Employee e=(Employee)a.getBean("e");
System.out.println(e);
a.registerShutdownHook();
	}

	
}
