package com.cwb.request;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Filter to create a list of files. Currently used to clean up files from a specific test.
 * @author cbrann
 * @ since 2013-01-15
 */

public class BaseFileFilter implements FilenameFilter{

		String base; 
		public BaseFileFilter (String base) { 
			this.base = base; 
		} 
		
		public boolean accept(File dir, String name) { 
			return name.startsWith(base);
		} 
}
