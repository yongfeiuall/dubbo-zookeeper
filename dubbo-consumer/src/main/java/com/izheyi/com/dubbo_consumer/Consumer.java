package com.izheyi.com.dubbo_consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.izheyi.com.dubbo_provider.DubboService;

public class Consumer {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        context.start();
        // Obtaining a remote service proxy
        DubboService demoService = (DubboService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("World!");
        // Display the call result
        System.out.println(hello);
    }

}
