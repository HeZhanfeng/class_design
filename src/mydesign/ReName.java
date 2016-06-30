package mydesign;

import java.io.File;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;

class ReName implements ActionListener{
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	JLabel label2 = null;
	JTextField jtf = null;
	BufferedReader bfr = null;
	String value;
	PrintWriter tempFile = null;
	public void rename(){
		f = new JFrame("删除业务员信息");
		f.setSize(180,100);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout());//更改布局方式
		
		//label2 = new JLabel("请输入您要删除的业务员编号或姓名:");
		//jtf = new JTextField(15);
		//cp.add(label2);
		//cp.add(jtf);
		
		b = new JButton("确定删除吗？");//创建按钮
		cp.add(b);//添加按钮
		b.addActionListener(this);//添加监听机制
		
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			System.out.println("哈哈");
			File file = new File("D:/JavaCode/class_design/data.txt");
		
			File newFile = new File("D:/JavaCode/class_design/info.txt");
			
			if (!file.exists() || newFile.isDirectory()) {

		            System.out.println("File does not exist: " + file);
		            return;
		    }
			
			if(file.renameTo(newFile)){
				System.out.println("修改成功");
			}
			else{
				System.out.println("修改失败");
			}
			
	}
	
}
