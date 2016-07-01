package mydesign;

import java.io.File;
import java.io.*;

class ReName {
	BufferedReader bfr = null;
	PrintWriter tempFile = null;
	public void rename(){

		File fi = new File("D:/JavaCode/class_design/info.txt");
		fi.delete();
		
		File file = new File("D:/JavaCode/class_design/data.txt");
		
		File newFile = new File("D:/JavaCode/class_design/info.txt");
		
		if (!file.exists()) {
	            System.out.println("文件不存在！: " + file);
	    }
		
		if(file.renameTo(newFile)){
			System.out.println("修改成功");
		}
		else{
			System.out.println("修改失败");
			
		}
		
	}
}
