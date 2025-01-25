package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;




public interface StudentDao {
	
	Student findById(int id );//根据主键id查询记录	
	Student findByPhoneAndPwd(@Param("stuno") String stuno,@Param("pwd")String pwd );//查询用户名和密码
	boolean update(@Param("record") Student record);//根据id更改
	List<Student> findAll(Student record);
	void delUser(Integer id);
	void insert(Student user);
	List<Student> selectByEno(String eno);
	




}
