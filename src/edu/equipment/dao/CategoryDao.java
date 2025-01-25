package edu.equipment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Admin;
import edu.equipment.model.Category;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;




public interface CategoryDao {
	
	Category findById(int id );//根据主键id查询记录	
	boolean update(@Param("record") Category record);//根据id更改
	List<Category> findAll(Category record);
	void delUser(Integer id);
	void insert(Category c);
	




}
