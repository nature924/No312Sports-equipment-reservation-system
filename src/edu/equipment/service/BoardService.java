package edu.equipment.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.equipment.dao.BoardDao;
import edu.equipment.model.Board;

@Service
public class BoardService implements BoardDao {
	@Autowired
	BoardDao dao;

	@Override
	public List<Board> findAll(Board b) {
		// TODO Auto-generated method stub
		return dao.findAll(b);
	}

	@Override
	public Board findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public boolean add(Board record) {
		// TODO Auto-generated method stub
		return dao.add(record);
	}

	@Override
	public boolean update(Board record) {
		// TODO Auto-generated method stub
		return dao.update(record);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public List<Board> findByProductMap(Map<String, Object> paramterMap) {
		// TODO Auto-generated method stub
		return dao.findByProductMap(paramterMap);
	}

	@Override
	public Board queryById(int id) {
		// TODO Auto-generated method stub
		return dao.queryById(id);
	}


	




	

}
