package com.song.IO.File;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByAll implements FilenameFilter{
	private String suffix;
	public FilterByAll(String suffix){
		this.suffix=suffix;
	}
	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(suffix);
	}

}
