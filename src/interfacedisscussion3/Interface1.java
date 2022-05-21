package interfacedisscussion3;

public interface Interface1 {
	
	public static final int v=10;
	//by default all variable are declared in interface are public static final whether we define or not
	boolean k=false;
	
	void close ();
	
	public abstract void back();
	
	public void refresh ();
	
//all methods are by default public and abstract
	
	static void m1()
	{
		System.out.println("static method must be completed in interface");
	}
//inside interface only complete method is there ,all static methods by default public and concrete
	
	public static void main(String[] args) {
		
		m1();
		Interface1.m1();
		System.out.println(v);
		System.out.println(k);
	}
}
