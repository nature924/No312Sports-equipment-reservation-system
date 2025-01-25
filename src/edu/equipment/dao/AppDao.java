package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;
import edu.equipment.model.Appointment;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;




public interface AppDao {
	
	Appointment findById(int id );//根据主键id查询记录	
	boolean update(@Param("record") Appointment record);//根据id更改
	List<Appointment> findAll(Appointment record);
	void delUser(Integer id);
	void insert(Appointment a);
	List<Appointment> findMyAll(Appointment app);
	




}
