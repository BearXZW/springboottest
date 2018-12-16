package com.sana.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@SpringApplicationConfiguration(classes=SpringboottestApplication.class)
//@SpringApplicationConfiguration(
//        classes = ReadingListApplication.class)
public class SpringboottestApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("hello world");
    }

}
