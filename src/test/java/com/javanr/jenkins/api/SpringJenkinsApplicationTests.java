package com.javanr.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

    @Test
     contextLoads() {
        logger.info("SpringJenkinsApplicationTests contextLoads starting...");
        logger.info("SpringJenkinsApplicationTests contextLoads starting second logger...");
        assertEquals(true, true);
    }

}
