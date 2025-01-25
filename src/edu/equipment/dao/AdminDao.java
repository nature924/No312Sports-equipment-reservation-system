package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;




public interface AdminDao {
	
	Admin findById(int id );//根据主键id查询记录	
	Admin findByPhoneAndPwd(@Param("eno") String eno,@Param("pwd")String pwd );//查询用户名和密码
	boolean update(@Param("record") Admin record);//根据id更改
	List<Admin> findAll(Admin record);
	void delUser(Integer id);
	void insert(Admin user);
	List<Admin> selectByEno(String eno);
	




}
