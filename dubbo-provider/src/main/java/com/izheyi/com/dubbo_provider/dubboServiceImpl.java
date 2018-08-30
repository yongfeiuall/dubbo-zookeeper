package com.izheyi.com.dubbo_provider;

public class dubboServiceImpl implements DubboService {

	public String sayHello(String name) {
        return "Hello " + name;
    }

}
