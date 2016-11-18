package org.kobic.genome.project.vo;

import java.io.Serializable;

public class ProjectVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String bin2;
	private String count;
	
	public String getBin2() {
		return bin2;
	}
	public void setBin2(String bin2) {
		this.bin2 = bin2;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

}
