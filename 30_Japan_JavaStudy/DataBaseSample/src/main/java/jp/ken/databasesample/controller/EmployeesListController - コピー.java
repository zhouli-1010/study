package jp.ken.databasesample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.databasesample.dao.EmployeeDAO;
import jp.ken.databasesample.entity.Employees;
import jp.ken.databasesample.model.EmployeesModel;

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
  
  @RequestMapping(value="/empSelect", method=RequestMethod.GET)
  public String emp (Model model){
	  EmployeesModel eModel = new EmployeesModel();
	  model.addAttribute("employeesModel",eModel);
	  model.addAttribute("message", "åüçıÇµÇΩÇ¢è]ã∆àıî‘çÜÇ‹ÇΩÇÕñºëOÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢ÅB");
	  return "selectEmployeesData";
  }
  
  @RequestMapping(value="/empSelect", method=RequestMethod.POST)
  public String empDisp (@Validated @ModelAttribute EmployeesModel eModel,
		  BindingResult result ,Model model){
	  model.addAttribute("message", "è]ã∆àıList");
	  List<Employees> list = null;
	  if (!result.hasErrors()) {
		  if (!eModel.getEmployee_id().equals("") && 
				  eModel.getEmployee_name().equals("")) {
			  int empId = Integer.parseInt(eModel.getEmployee_id());
			  Employees emp = empDAO.getById(empId);
			  list = new ArrayList<Employees>();
			  list.add(emp);
		  } else if (eModel.getEmployee_id().equals("") && 
				  !eModel.getEmployee_name().equals("")) {
			  list = empDAO.getByName(eModel.getEmployee_name());
		  } else {
			  list = empDAO.allList();
		  }
		  model.addAttribute("employeesSelectList", list);		  
	  }
	  return "selectEmployeesData";
  }
} 
