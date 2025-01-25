package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;
import edu.equipment.model.Equipment;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;




public interface EquipmentDao {
	
	Equipment findById(int id );//根据主键id查询记录	
	boolean update(@Param("record") Equipment record);//根据id更改
	List<Equipment> findAll(Equipment record);
	void delUser(Integer id);
	void insert(Equipment e);
	




}
