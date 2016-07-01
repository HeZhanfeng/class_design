/**
 * 查询：
 * 输入业务员编号或姓名
 * 输出业务员的所有信息
 * */
package mydesign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.*;

class Delete implements ActionListener{
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
	public void delete(){
		f = new JFrame("删除业务员信息");
		f.setSize(280,200);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout());//更改布局方式
		
		label2 = new JLabel("请输入您要删除的业务员编号或姓名:");
		jtf = new JTextField(15);
		cp.add(label2);
		cp.add(jtf);
		
		b = new JButton("确定");//创建按钮
		cp.add(b);//添加按钮
		b.addActionListener(this);//添加监听机制
		
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		value = jtf.getText();//获取文本框输入的值
		//System.out.println("value="+value);
		try {

			bfr=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));
			
			try {
				tempFile = new PrintWriter(new BufferedWriter(new FileWriter("data.txt",
						true)));
			} catch (IOException e2) {
				// TODO 自动生成的 catch 块
				System.out.println("创建新文件失败！");
			}
			
			//PrintWriter pw = new PrintWriter(new FileWriter("tempFile"));
			try {
				
				do {
					a=bfr.readLine();
					String[] strs = a.split(" ");
					//String[] strs1 = {strs[0],strs[1],strs[2],strs[3],strs[4]};
//					String c = "";
//				    //将strs1数组转成字符串a
//					for(String j:strs1){
//						c += j+" "; 
//					}
					//System.out.println(strs[0]);
					
			
					if(value.trim().equals(strs[0])||value.trim().equals(strs[1])){
							//System.out.println(value.trim().equals(strs[0]));
							
//							label2 = new JLabel(c);
//							cp.add(label2);
							jtf.setText("");
							f.setVisible(true);//显示窗体
							f.setLocationRelativeTo(null);//窗体居中
							continue;
					}
					else{
						tempFile.println(a);
						tempFile.flush();
						continue;
					}
				}while(a!=null);
				
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

		} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
		}
		finally{
			
			
			
			try {
				bfr.close();
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			tempFile.close();
		}
	}
}


