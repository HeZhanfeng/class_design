package mydesign;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Sort {
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	BufferedReader Ia;
	Map<String,String> map;
	Sort(){
		// 创建集合，将缓冲区数据存入集合中
		//List<String> list = new ArrayList<String>();
		map = new TreeMap<String,String>(
				new Comparator<String>(){
					public int compare(String obj1,String obj2){
						return obj1.compareTo(obj2);
					}
				}
				);
		f = new JFrame("查询信息");
		f.setSize(250,320);//设置大小
		
		cp = f.getContentPane();//加载面板
		cp.setLayout(new FlowLayout());//更改布局方式
		
		label = new JLabel("编号"+"\0\0"+"姓名"+"\0\0"+"性别"+"\0\0"+"部门"+"\0\0"+"工资");
		cp.add(label);
		
		try {

			Ia=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));

			String str;
			try {
				while ((str = Ia.readLine())!=null){
					String[] strs = str.split(" ");
					if(strs.length!=5){
						System.out.println("有数据错误"+str);
					}
					try{
						map.put(strs[0],strs[1]);
					}
					catch(Exception e){
						System.out.println("有误");
					}
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			 Set<String> keySet = map.keySet();
		        Iterator<String> iter = keySet.iterator();
		        while (iter.hasNext()) {
		            String key = iter.next();
		            System.out.println(key + ":" + map.get(key));
		        }			
							
					// 创建区分语言环境的比较器，调用sort方法并传递比较器对数组进行排序
//					Collator cmp = Collator.getInstance(java.util.Locale.CHINA);
//					Collections.sort(list, cmp);
//					// 遍历集合，打印到控制台
//					for (String str : list) {
//						do {					
//							label1 = new JLabel(str);
//							cp.add(label1);
//							try {
//								str=Ia.readLine();
//							} catch (IOException e) {
//								// TODO 自动生成的 catch 块
//								e.printStackTrace();
//							}
//						}while(str!=null);
//						label1 = new JLabel(str);
//						cp.add(label1);
//					}
			 

		} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
		finally{
			try {
				Ia.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		f.setVisible(true);//显示窗体
		f.setLocationRelativeTo(null);//窗体居中
	}

}

