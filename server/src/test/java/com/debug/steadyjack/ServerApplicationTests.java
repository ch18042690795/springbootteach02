package com.debug.steadyjack;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServerApplication.class)
public class ServerApplicationTests {

	private static final Logger log= LoggerFactory.getLogger(ServerApplicationTests.class);


	@Test
	public void contextLoads() {
		log.debug("测试");
	}

}
