package edu.equipment.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) throws Exception {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("WebContent/WEB-INF/springConfig.xml");	
		SqlSessionFactory factory=(SqlSessionFactory) ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
		SqlSession session=factory.openSession();
		
		session.close();
		System.out.println("ok");
	}
}
