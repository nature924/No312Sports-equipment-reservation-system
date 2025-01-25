package edu.equipment.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import edu.equipment.dao.AdminDao;
import edu.equipment.model.Admin;


public class Test {

	public static void main(String[] args) throws Exception {
		String resource="mybatis-config.xml";
		InputStream is=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=factory.openSession();
		AdminDao dao=session.getMapper(AdminDao.class);
		/*UserDao dao=session.getMapper(UserDao.class);
		User user=dao.findById(1);*/
		Admin admin=dao.findById(1);
		System.out.println(admin.getPwd());
		/*List<User> list=memberdao.selectAll();
		for(User u:list) {
			System.out.println(u.getUname());
			System.out.println("ok");
		}*/
		/*User record=new User();
		record.setUsername("");
		
		int insert=userMapper.insert(record);*/
 		
		session.commit();
		session.close();
		
		

	}

}
