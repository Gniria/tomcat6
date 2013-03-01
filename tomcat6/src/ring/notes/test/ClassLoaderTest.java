package ring.notes.test;

/**
 * JVM������ʱ���������ClassLoader:
 * Bootstrap ClassLoader (JVM�Դ����������(JVMʵ�����ṩ���)����������java�ĺ�����⣬����java.lang.*)
 * Extension ClassLoader (�Ӽ�)
 * App ClassLoader(���Ӽ�)
 * 
 * @author mlb 2013-02-26
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		Class c = null;
		//��ȡ��ǰĬ�ϵ��������(���ص�ǰ����� ClassLoader)
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		
		System.out.println("��ǰĬ����������� " + cl);
		System.out.println("��ǰ��������ĸ���������(ע��JVM�Դ���Bootstrap ClassLoader�������ǲ���ʾ�ģ�����Ϊnull)");
		while(cl!=null){
			cl = cl.getParent();
			System.out.println(cl);
		}
		
		try{
			ClassLoaderTest ct = new ClassLoaderTest();
			c = Class.forName("java.lang.Object");
			cl = c.getClassLoader();
			System.out.println("java.lang.Object ��ClassLoader�ǣ� " + cl);
//			c = Class.forName("ClassLoaderTest");//����ᱨClassNotFoundException
			c = ct.getClass();
			cl = c.getClassLoader();
			System.out.println("ClassLoaderTest's ClassLoader is : " + cl);
		}catch(Exception e){
			System.out.println("Failed to get the Class Instance.");
		}
	}
}
