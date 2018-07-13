package log;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog {
	static Logger logger = Logger.getLogger(TestLog.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("src/log4j.properties");
	}
}
