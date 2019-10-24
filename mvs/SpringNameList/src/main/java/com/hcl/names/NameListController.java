<<<<<<< HEAD
package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
@RequestMapping("/names")
public ModelAndView nameDemo(){
	List<String> lstNames=new ArrayList<String>();
	lstNames.add("uttam");
	lstNames.add("anubhav");
	lstNames.add("aditya");
	lstNames.add("laksh");
	lstNames.add("bindu");
	return new ModelAndView("ShowPage","lists",lstNames);
}
}
=======
package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
@RequestMapping("/names")
public ModelAndView nameDemo(){
	List<String> lstNames=new ArrayList<String>();
	lstNames.add("uttam");
	lstNames.add("anubhav");
	lstNames.add("aditya");
	lstNames.add("laksh");
	lstNames.add("bindu");
	return new ModelAndView("ShowPage","lists",lstNames);
}
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
