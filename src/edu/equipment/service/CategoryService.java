package edu.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.AdminDao;
import edu.equipment.dao.CategoryDao;
import edu.equipment.dao.StudentDao;
import edu.equipment.dao.TeacherDao;
import edu.equipment.model.Admin;
import edu.equipment.model.Category;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;

@Service
public class CategoryService implements CategoryDao {
	@Autowired
	CategoryDao dao;

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	
	
	@Override
	public boolean update(Category record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}


	public List<Category> findAll(Category record) {
		// TODO 自动生成的方法存根
		return dao.findAll(record);
	}



	public void delUser(Integer id) {
		// TODO 自动生成的方法存根
		dao.delUser(id);
	}


	public void insert(Category c) {
		// TODO 自动生成的方法存根
		dao.insert(c);
	}





}
