package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.dto.deptDto;

public interface DeptDao {
	
	/*
	 * private JdbcTemplate jdbctemplate;
	 * @Autowired
	 * public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	 *	this.jdbctemplate = jdbctemplate;
	 * }
	*/
	
	int insertDept(deptDto dto);
	int update(deptDto dto);
	int delete(deptDto dto);

	List<deptDto> getDeptList(); //전체조회
	
	
	/*public ArrayList<deptDto> getDeptList() throws SQLException {
		String sql = "select deptno,dname,loc from dept";
		ArrayList<deptDto> deptlist = (ArrayList<deptDto>) jdbctemplate.query(sql,
				new BeanPropertyRowMapper<deptDto>(deptDto.class));
		return (ArrayList<deptDto>) jdbctemplate.query(sql,
				new BeanPropertyRowMapper<deptDto>(deptDto.class));
	}*/
	
	/*public int insertDept(deptDto d) {
		String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
		return this.jdbctemplate.update(sql,d.getDeptno(),d.getDname(),d.getLoc()); 

	}*/
	
	/*public int update(deptDto d) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE DEPT SET DNAME=?, LOC=? WHERE DEPTNO=?";
		return this.jdbctemplate.update(sql,d.getDname(),d.getLoc(),d.getDeptno());

	}*/
	
/*	public int delete(int deptno) throws ClassNotFoundException, SQLException {
	      String sql = "DELETE dept WHERE deptno=?";
	      return this.jdbctemplate.update(sql, deptno);
	   }*/
	
}
