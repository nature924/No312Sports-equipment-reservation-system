package edu.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.AdminDao;
import edu.equipment.dao.AppDao;
import edu.equipment.dao.StudentDao;
import edu.equipment.dao.TeacherDao;
import edu.equipment.model.Admin;
import edu.equipment.model.Appointment;
import edu.equipment.model.Student;
import edu.equipment.model.Teacher;

@Service
public class AppService implements AppDao {
	@Autowired
	AppDao dao;

	@Override
	public Appointment findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}


	@Override
	public boolean update(Appointment record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}


	public List<Appointment> findAll(Appointment record) {
		// TODO 自动生成的方法存根
		return dao.findAll(record);
	}



	public void delUser(Integer id) {
		// TODO 自动生成的方法存根
		dao.delUser(id);
	}


	public void insert(Appointment a) {
		// TODO 自动生成的方法存根
		dao.insert(a);
	}


	public List<Appointment> findMyAll(Appointment app) {
		// TODO 自动生成的方法存根
		return dao.findMyAll(app);
	}


	



}
