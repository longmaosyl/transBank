package com.etransfar.transBank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/spr-common.xml","classpath:META-INF/spring/spr-quartz-dayend.xml"})
public class TestBase {
	@Test
	public void testDummy(){
	}
}
