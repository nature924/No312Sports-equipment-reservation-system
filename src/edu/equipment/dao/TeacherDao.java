package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;
import edu.equipment.model.Teacher;




public interface TeacherDao {
	
	Teacher findById(int id );//根据主键id查询记录	
	Teacher findByPhoneAndPwd(@Param("tno") String tno,@Param("pwd")String pwd );//查询用户名和密码
	boolean update(@Param("record") Teacher record);//根据id更改
	List<Teacher> findAll(Teacher record);
	void delUser(Integer id);
	void insert(Teacher user);
	List<Teacher> selectByEno(String eno);
	




}
