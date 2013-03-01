package ring.notes.test;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

/**
 * java log
 * java�и��ָ�����log���ߣ�java core API���и�(java.util.log),Jakara��Ŀ���и�commons-logging.jar
 * ���⻹��log4j�ȡ�
 * 
 * @author mlb 2013-03-01
 *
 */
public class LogTest {
    public static void main(String[] args) {
	//java �����ṩ��logger����
	Logger logJava = Logger.getAnonymousLogger();//ʵ����logger����
	LogManager.getLogManager().addLogger(logJava);//����logger����
	
	//tomcat��ʹ�õ�Logger
	Log logger = LogFactory.getLog(LogTest.class);
	
    }
}
