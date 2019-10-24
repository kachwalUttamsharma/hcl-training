package com.hcl.Controller;

import java.awt.print.Pageable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.Dao.EmployeeRepository;
import com.hcl.model.employee;

@RestController
public class EmployeeController {
	
    int pages = 3;
	@Autowired
	private EmployeeRepository employeedao;
	
	@RequestMapping("/")
	public ModelAndView getAllEmployees()
	{
		ModelAndView mv=new ModelAndView();
		List<employee> lst = (List<employee>)employeedao.findAll();
		mv.addObject("page",pages);
		mv.addObject("totalrecords",lst.size());
		mv.addObject("employees",lst);
        mv.setViewName("home");
        return mv;
	}

	@RequestMapping("/displayAllPages/page/{pageno}")
	public ModelAndView displayAllSortByDesig(@PathVariable("pageno") int pageno)
	{
		ModelAndView mv1=new ModelAndView();
		mv1.addObject("page",pages);
		List<employee> lst = (List<employee>)employeedao.findAll();
		mv1.addObject("totalrecords",lst.size());
		mv1.addObject("employees", employeedao.findAll(PageRequest.of(pageno,pages)).getContent());
       mv1.setViewName("home");
        return mv1;
	}

	
//	private Pageable gotoPage(int page)
//	{
//		PageRequest request = new PageRequest(page,PAGE_SIZE,Sort.Direction.DESC,"empno");
//		return (Pageable) request;
//	}
//
//
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index(Model model, HttpSession session, @RequestParam(value="pageNo", required=false, defaultValue = "0") String pageNo) {
//	int lastPageNo;
//	int gotoPageNo=Integer.parseInt(pageNo);
//	Set<employee> allemployees=new LinkedHashSet<employee>();
//
//
//		for(employee e:employeedao.findAll(gotoPage(gotoPageNo)))		
//		{
//			allemployees.add(e);
//		}
//
//
//		totalUsersCount=employeedao.count(); 		
//		if(totalUsersCount%PAGE_SIZE!=0)
//		lastPageNo=(int)(totalUsersCount/PAGE_SIZE)+1;					
//		else
//		lastPageNo=(int)(totalUsersCount/PAGE_SIZE);
//
//
//		model.addAttribute("lastPageNo",lastPageNo);					
//		model.addAttribute("users",allemployees);
//		return "index";
//	}
//@RequestMapping("/displayjavacontractor")
//public ModelAndView getemploy1 (){
//	ModelAndView modelAndView1 = new ModelAndView();
//
//	modelAndView1.addObject("employees",employeedao.findByDeptAndDesign("java", "coder"));
//	modelAndView1.setViewName("home");
//	       return modelAndView1;
//}
//
//@RequestMapping("/displayjavaemployees")
//public ModelAndView getemploy (){
//	ModelAndView modelAndView2 = new ModelAndView();
//	modelAndView2.addObject("employees",employeedao.findByDept("java", "developer"));
//	modelAndView2.setViewName("home");
//	       return modelAndView2;
//}
//
//@RequestMapping("/displayjavamanagers")
//public ModelAndView getemploy2 (){
//	ModelAndView modelAndView2 = new ModelAndView();
//	modelAndView2.addObject("employees",employeedao.findByDesig("java", "training"));
//	modelAndView2.setViewName("home");
//	       return modelAndView2;
//}
//
//@RequestMapping("/displayjavasalariesgreterthan5000")
//public ModelAndView getemploy3 (){
//	ModelAndView modelAndView2 = new ModelAndView();
//	modelAndView2.addObject("employees",employeedao.findByBasic(5000, "java", "training"));
//	modelAndView2.setViewName("home");
//	       return modelAndView2;
//}
//
//@RequestMapping("/displaywithstartwithname")
//public ModelAndView getemploy4 (){
//	ModelAndView modelAndView4 = new ModelAndView();
//	modelAndView4.addObject("employees",employeedao.findByBasic(5000, "java", "training"));
//	modelAndView4.setViewName("home");
//	       return modelAndView4;
//}
//
//@RequestMapping("/displayAllSortByDesig")
//public ModelAndView displayAllSortByDesig (){
//	ModelAndView mv = new ModelAndView();
//	mv.addObject("employees",employeedao.findAll(Sort.by("desig")));
//	mv.setViewName("home");
//	       return mv;
//}
//
//@RequestMapping("/displayallbydesendingdesig")
//public ModelAndView displayAllSortBydesendingdesig (){
//	ModelAndView mv1 = new ModelAndView();
//	mv1.addObject("employees",employeedao.findAll(Sort.by("desig").descending()));
//	mv1.setViewName("home");
//	       return mv1;
//}
//
//@RequestMapping("/displayallbydesendingdesigandsalary")
//public ModelAndView displayAllSortBydesendingdesigandsalary (){
//	ModelAndView mv2 = new ModelAndView();
//	mv2.addObject("employees",employeedao.findAll(Sort.by("desig").descending().and(Sort.by("basic").descending())));
//	mv2.setViewName("home");
//	       return mv2;
//}
//
//@RequestMapping("/displayjavaandsalary")
//public ModelAndView displayAllSortBysalaryanddesig (){
//	ModelAndView mv3 = new ModelAndView();
//	mv3.addObject("employees",employeedao.findByDept("java",Sort.by("basic").descending()));
//	mv3.setViewName("home");
//	       return mv3;
//}
//
//@RequestMapping("/displaysalariesgreaterthan5000andstartingwith")
//public ModelAndView displayAllSortBysalaryanddesigstartingwith (){
//	ModelAndView mv4 = new ModelAndView();
//	mv4.addObject("employees",employeedao.findByName(5000, "java","training", Sort.by("basic").descending()));
//	mv4.setViewName("home");
//	       return mv4;
//}
}

/*
 * @RequestMapping(value="/searchemployee",method = RequestMethod.POST) public
 * ModelAndView searchEmployee (ModelAndView model, HttpServletRequest req){
 * List<Employee> Lst =
 * employeeService.getEmployee(req.getParameter("empname"),req.getParameter(
 * "bandname"),req.getParameter("salary")); model.addObject("employeeList",Lst);
 * model.setViewName("employeehome"); return model; }
 * 
 * }
 */


