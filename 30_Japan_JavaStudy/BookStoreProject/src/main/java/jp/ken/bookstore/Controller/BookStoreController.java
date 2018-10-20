package jp.ken.bookstore.Controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.ken.bookstore.dao.AuthorDAO;
import jp.ken.bookstore.dao.ProductDAO;
import jp.ken.bookstore.entity.Author;
import jp.ken.bookstore.entity.Product;


@Controller
public class BookStoreController {
	private static ApplicationContext context = 
			new ClassPathXmlApplicationContext("bookstore.xml");
	
	@SuppressWarnings("unchecked")
	private static AuthorDAO<Author> authorDAO =
	  (AuthorDAO<Author>)context.getBean("authorDAO");
	
	@SuppressWarnings("unchecked")
	private static ProductDAO<Product> productDAO =
	  (ProductDAO<Product>)context.getBean("productDAO");
	
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String showindex (Model model){
		  return "index";
	}
	
//	@RequestMapping(value="/allList", method=RequestMethod.GET)
//	public String allList (Model model){
////		  List<Departments> list = deptDAO.allList();
////		  model.addAttribute("message","ïîèêList");
////		  model.addAttribute("departmentList", list);
//		  return "allList";
//	}
//
//	@RequestMapping(value="/allList", method=RequestMethod.POST)
//	public String sendAList (Model model){
////		  List<Departments> list = deptDAO.allList();
////		  model.addAttribute("message","ïîèêList");
////		  model.addAttribute("departmentList", list);
//		  return "allList";
//	}
//
//	@RequestMapping(value="/vagueList", method=RequestMethod.GET)
//	public String vagueList (Model model){
////		  List<Departments> list = deptDAO.allList();
////		  model.addAttribute("message","ïîèêList");
////		  model.addAttribute("departmentList", list);
//		  return "allList";
//	}
//
//	@RequestMapping(value="/vagueList", method=RequestMethod.POST)
//	public String sendVList (Model model){
////		  List<Departments> list = deptDAO.allList();
////		  model.addAttribute("message","ïîèêList");
////		  model.addAttribute("departmentList", list);
//		  return "allList";
//	}

}