package edu.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.AdminDao;
import edu.equipment.dao.EquipmentDao;
import edu.equipment.dao.StudentDao;
import edu.equipment.dao.TeacherDao;
import edu.equipment.model.Admin;
import edu.equipment.model.Equipment;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;

@Service
public class EquipmentService implements EquipmentDao {
	@Autowired
	EquipmentDao dao;

	@Override
	public Equipment findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	
	@Override
	public boolean update(Equipment record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}


	public List<Equipment> findAll(Equipment record) {
		// TODO 自动生成的方法存根
		return dao.findAll(record);
	}



	public void delUser(Integer id) {
		// TODO 自动生成的方法存根
		dao.delUser(id);
	}


	public void insert(Equipment user) {
		// TODO 自动生成的方法存根
		dao.insert(user);
	}





}
