package edu.equipment.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import edu.equipment.model.Board;




public interface BoardDao {
	
	List<Board> findAll(Board b);//查询所有
	Board findById(int id );//
	boolean add(Board record);//插入
	boolean update(@Param("record") Board record);//根据id更改
	boolean delete(int id);//根据id删除
	List<Board> findByProductMap(Map<String, Object> paramterMap);//根据条件进行查询
	Board queryById(int id );//




}
