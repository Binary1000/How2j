package log;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {
	static Logger logger = Logger.getLogger(TestLog.class);
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		PropertyConfigurator.configure("src/log4j.properties");
		for (int i = 0; i < 5000; i++) {
            logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
        }
	}
}
