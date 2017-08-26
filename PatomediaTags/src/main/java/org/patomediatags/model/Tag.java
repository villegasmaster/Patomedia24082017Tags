package org.patomediatags.model;

import java.util.List;

public class Tag {
	
	private String adName;
	
	private String tag;

	private List<String> macros;
	
	
	
	

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<String> getMacros() {
		return macros;
	}

	public void setMacros(List<String> macros) {
		this.macros = macros;
	}
	
	
	
}
