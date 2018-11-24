import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.tiles.Initializable;
/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{*/
public class Employee {
    private int eid;
	private String ename;
	private double esal;
	public Employee()
	{
		System.out.println("i am default constructor");
		
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	/*public void s()
	{
		System.out.println("init");
	}
public void b()
{
	System.out.println("destroy");
}*/
	@PostConstruct
	public void s()
	{
		System.out.println("init");
	}
	@PreDestroy
     public void b()
    {
	System.out.println("destroy");
    }

/*	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inin method");
	}*/
}
