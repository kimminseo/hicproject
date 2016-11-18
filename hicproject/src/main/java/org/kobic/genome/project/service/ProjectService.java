package org.kobic.genome.project.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.kobic.genome.project.mapper.ProjectMapper;
import org.kobic.genome.project.vo.ProjectVo;
import org.springframework.stereotype.Service;

@Service(value = "projectService")
public class ProjectService {
	
	@Resource(name = "projectMapper")
	private ProjectMapper projectMapper;
	
	
	public List<ProjectVo> testGraph(){
		List<ProjectVo> vo = this.projectMapper.testGraph();
		
		return vo;		
	};
	public Map<String, Object> hoho (List<ProjectVo> vo){
		Map<String, Object> statMap = new LinkedHashMap<String, Object>();
		statMap.put("stat", vo.size());
		return statMap;
	}
}
