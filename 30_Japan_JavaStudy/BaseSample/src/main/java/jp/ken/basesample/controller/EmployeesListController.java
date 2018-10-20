package jp.ken.basesample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.basesample.dao.EmployeeDAO;
import jp.ken.basesample.entity.Employees;

@Controller
public class EmployeesListController {
  private static ApplicationContext context = 
		  new ClassPathXmlApplicationContext("springx.xml");
  
  @SuppressWarnings("unchecked")
  private static EmployeeDAO<Employees> empDAO = 
    	(EmployeeDAO<Employees>) context.getBean("employeeDAO");
  
  @RequestMapping(value="/empList", method=RequestMethod.GET)
  public String empList (Model model){
	  List<Employees> list = empDAO.allList();
	  model.addAttribute("message","è]ã∆àıList");
	  model.addAttribute("employeeList", list);
	  return "listEmployeesData";
  }
 
 
} 
