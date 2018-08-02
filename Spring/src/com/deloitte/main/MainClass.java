package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojos.HelloIndia;
import com.deloitte.pojos.HelloWorld;
import com.deloitte.pojos.Point;
import com.deloitte.pojos.SpellChecker;
import com.deloitte.pojos.TextEditor;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Point point1 = (Point)context.getBean("pointBean");
		System.out.println(point1);
		Point point2 = (Point)context.getBean("pointBean");
		System.out.println(point2);
		
		point2.setX(8);
		point2.setY(16);
		
		System.out.println(point1);
		
		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		HelloIndia objB = (HelloIndia)context.getBean("helloIndia");
		
		objA.getMessage1();
		objA.getMessage2();
		
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		TextEditor text1 = (TextEditor)context.getBean("textEditorCDI");
		text1.spellCheck();
		
		TextEditor text2 = (TextEditor)context.getBean("textEditorSDI");
		text2.spellCheck();
		
		TextEditor text3 = (TextEditor)context.getBean("textEditorAWbN");
		text3.spellCheck();
		
		TextEditor text4 = (TextEditor)context.getBean("textEditorAWbT");
		text4.spellCheck();
		
		TextEditor text5 = (TextEditor)context.getBean("textEditorAWbT");
		text5.spellCheck();
		text5.getName();
		
		((AbstractApplicationContext) context).registerShutdownHook();	
		
	}

}
                                                                                                                                                                                                                                             