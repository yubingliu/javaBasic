package com.yihaomen.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yihaomen.annotion.Person;
//http://blog.csdn.net/is_zhoufeng/article/details/7683194
public class PersonTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonControl ps = (PersonControl) ac.getBean("PersonControl");	//≤‚ ‘
		ps.savePerson(new Person(3, "qqq") , "sss" , 100 , "243970446@qq.com");
	}
}

