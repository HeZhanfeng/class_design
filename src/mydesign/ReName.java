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
	            System.out.println("�ļ������ڣ�: " + file);
	    }
		
		if(file.renameTo(newFile)){
			System.out.println("�޸ĳɹ�");
		}
		else{
			System.out.println("�޸�ʧ��");
			
		}
		
	}
}
