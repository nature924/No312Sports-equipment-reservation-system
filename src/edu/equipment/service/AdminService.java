package edu.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.AdminDao;
import edu.equipment.model.Admin;

@Service
public class AdminService implements AdminDao {
	@Autowired
	AdminDao dao;

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	
	@Override
	public Admin findByPhoneAndPwd(String eno, String pwd) {
		// TODO Auto-generated method stub
		return dao.findByPhoneAndPwd(eno, pwd);
	}

	@Override
	public boolean update(Admin record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}


	public List<Admin> findAll(Admin record) {
		// TODO 自动生成的方法存根
		return dao.findAll(record);
	}



	public void delUser(Integer id) {
		// TODO 自动生成的方法存根
		dao.delUser(id);
	}


	public void insert(Admin user) {
		// TODO 自动生成的方法存根
		dao.insert(user);
	}


	public List<Admin> selectByEno(String eno) {
		// TODO 自动生成的方法存根
		return dao.selectByEno(eno);
	}



}
