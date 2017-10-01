package com.song.IO.File;

import java.io.File;
import java.io.FilenameFilter;


public class FilterNameByJava implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		//System.out.println(dir+"---"+name);
		return name.endsWith(".jpg");
	}

	

}
