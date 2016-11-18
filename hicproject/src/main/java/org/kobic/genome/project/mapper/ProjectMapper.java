package org.kobic.genome.project.mapper;

import java.util.List;

import org.kobic.genome.project.vo.ProjectVo;
import org.springframework.stereotype.Repository;

@Repository(value = "projectMapper")
public interface ProjectMapper {
	
	public List<ProjectVo> testGraph();

}
