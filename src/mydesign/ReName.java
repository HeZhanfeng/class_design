package mydesign;

import java.io.File;
import java.io.FileNotFoundException;
import java.awt.*;

import javax.swing.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ReName {
	BufferedReader bfr = null;
	PrintWriter tempFile = null;
	public void rename(){
//		try{
//		    Thread thread = Thread.currentThread();
//		    thread.sleep(1500);//��ͣ1.5���������ִ��
//		}catch (InterruptedException e3) {
//		    // TODO Auto-generated catch block
//		    e3.printStackTrace();
//		}
//		System.out.println("����");
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
		
//			  try {
//			   FileReader fr = new FileReader(file.getPath());
//			   BufferedReader br = new BufferedReader(fr);
//			   List list = new ArrayList();
//			   String ss = "";
//			   while ((ss = br.readLine()) != null)
//			    list.add(ss);
//			    fr.close();
//			   return list;
//			  } catch (Exception e) {
//			   e.printStackTrace();
//			  }
//			return null;
//			  
//	}
//	public void del(){
//		ReName rn = new ReName();
//		List l = rn.rename();
//		l.remove(new Delete().value);
//	}
	}
}
