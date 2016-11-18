package org.kobic.genome.project.web;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kobic.genome.project.service.ProjectService;
import org.kobic.genome.project.vo.ProjectVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProjectController {
	
	@Resource(name = "projectService")
	private ProjectService projectService;
	
	@RequestMapping(value = "/graph", method = RequestMethod.GET)
	public ModelAndView graph(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
		
//		List<ProjectVo> test = this.projectService.testGraph();
		
		mv.setViewName("graph/graph");
//		if(test != null && test.size() > 0){
//			mv.addObject("test", test);
//		}
		return mv;
	}
}
