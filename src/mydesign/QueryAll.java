package mydesign;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class QueryAll {
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	BufferedReader Ia;
	Map<String,String> map;
	QueryAll(){
		// 创建集合，将缓冲区数据存入集合中
		//List<String> list = new ArrayList<String>();
		map = new TreeMap<String,String>(
				//比较器
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
					String[] strs1 = {strs[1],strs[2],strs[3],strs[4]};
					//String b = Arrays.toString(strs1);//将strs1转成字符串b
					String a = "";
					//将strs1数组转成字符串a
					for(String j:strs1){
						a += j+"  "; 
					}
					try{
						map.put(strs[0],a);
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
	            label1 = new JLabel(key+" 	"+map.get(key));
	            cp.add(label1);
	            //System.out.println(key + ":" + map.get(key));
	        }			

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