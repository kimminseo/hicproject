package org.kobic.genome.project.web;

import java.util.Locale;

import javax.annotation.Resource;

import org.kobic.genome.project.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
	
	@Resource(name = "projectService")
	private ProjectService projectService;
}
