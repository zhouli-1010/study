package jp.ken.databasesample.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.databasesample.dao.DepartmentDAO;
import jp.ken.databasesample.entity.Departments;
//departmentList
@Controller
public class DepartmentsListController {
  private static ApplicationContext context = 
		  new ClassPathXmlApplicationContext("springx.xml");
  
  @SuppressWarnings("unchecked")
  private static DepartmentDAO<Departments> deptDAO = 
	(DepartmentDAO<Departments>) context.getBean("departmentDAO");
  
  @RequestMapping(value="/deptList", method=RequestMethod.GET)
  public String empList (Model model){
	  List<Departments> list = deptDAO.allList();
	  model.addAttribute("message","ïîèêList");
	  model.addAttribute("departmentList", list);
	  return "listDepartmentsData";
  }
} 
