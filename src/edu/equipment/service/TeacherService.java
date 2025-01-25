package edu.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.AdminDao;
import edu.equipment.dao.TeacherDao;
import edu.equipment.model.Admin;
import edu.equipment.model.Teacher;

@Service
public class TeacherService implements TeacherDao {
	@Autowired
	TeacherDao dao;

	@Override
	public Teacher findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	
	@Override
	public Teacher findByPhoneAndPwd(String tno, String pwd) {
		// TODO Auto-generated method stub
		return dao.findByPhoneAndPwd(tno, pwd);
	}

	@Override
	public boolean update(Teacher record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}


	public List<Teacher> findAll(Teacher record) {
		// TODO 自动生成的方法存根
		return dao.findAll(record);
	}



	public void delUser(Integer id) {
		// TODO 自动生成的方法存根
		dao.delUser(id);
	}


	public void insert(Teacher user) {
		// TODO 自动生成的方法存根
		dao.insert(user);
	}


	public List<Teacher> selectByEno(String eno) {
		// TODO 自动生成的方法存根
		return dao.selectByEno(eno);
	}



}
