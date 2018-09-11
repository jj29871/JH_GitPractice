package com.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.DeptDao;
import com.dto.deptDto;

@Controller
public class DeptController {
	
	@Autowired
	private SqlSession sqlsession;
	
	
	@RequestMapping("index.htm")
		public String deptlist(Model model) throws SQLException {
			
			DeptDao deptDao = sqlsession.getMapper(DeptDao.class);
			
			HashMap map = new HashMap();
			
			List<deptDto> list = deptDao.getDeptList();
			
			model.addAttribute("list", list);
		return "home.deptList";
	}
	
	@RequestMapping("deptList.htm")
	public String getlist(Model model) throws SQLException {
		
		DeptDao deptDao = sqlsession.getMapper(DeptDao.class);
		
		HashMap map = new HashMap();
		List<deptDto> list = deptDao.getDeptList();
		model.addAttribute("list", list);
		return "home.deptList";
	}
	
	@RequestMapping(value="deptInsert.htm", method=RequestMethod.GET)
	public String deptinsert() {
		
		return "crud.deptInsert"; 
	}
	
	@RequestMapping(value="deptInsert.htm", method=RequestMethod.POST)
	public String insert(deptDto dto) {
		
		DeptDao deptDao = sqlsession.getMapper(DeptDao.class); 
		
		deptDao.insertDept(dto);
		return "redirect:index.htm";
	}
	
	@RequestMapping(value="deptUpdate.htm", method=RequestMethod.GET)
	public String deptupdateForm() {
		
		return "crud.deptUpdate"; 
	}
	
	@RequestMapping(value="deptUpdate.htm", method=RequestMethod.POST)
	public String deptupdate(deptDto dto) throws ClassNotFoundException, SQLException {
		
		DeptDao deptDao = sqlsession.getMapper(DeptDao.class);
		deptDao.update(dto);
		
		return "redirect:index.htm"; 
	}
	
	@RequestMapping(value="deptDelete.htm")
	   public String deptdelete(deptDto dto) {
	      
		DeptDao deptDao = sqlsession.getMapper(DeptDao.class);
	    
		deptDao.delete(dto);
		
	    return "redirect:index.htm";
	      
	   }
	
}
