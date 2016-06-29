package mydesign;

import java.awt.Container;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class QueryPay {
	
	JFrame f;
	JButton b;
	Container cp;
	String a = null;
	JLabel label = null;
	JLabel label1 = null;
	BufferedReader Ia;
	Map<String,String> map;
	
	public void pay(){
		map = new TreeMap<String,String>(
				//�Ƚ���
				new Comparator<String>(){
					public int compare(String obj1,String obj2){
						return obj1.compareTo(obj2);
					}
				}
				);
		f = new JFrame("��ѯ��Ϣ");
		f.setSize(250,320);//���ô�С
		
		cp = f.getContentPane();//�������
		cp.setLayout(new FlowLayout());//���Ĳ��ַ�ʽ
		
		label = new JLabel("���"+"\0\0"+"����"+"\0\0"+"�Ա�"+"\0\0"+"����"+"\0\0"+"����");
		cp.add(label);
		
		try {

			Ia=new BufferedReader(new InputStreamReader(
					new FileInputStream("D:/JavaCode/class_design/info.txt")));

			String str;
			try {
				while ((str = Ia.readLine())!=null){
					String[] strs = str.split(" ");
					String[] strs1 = {strs[0],strs[1],strs[2],strs[3]};
					//String b = Arrays.toString(strs1);//��strs1ת���ַ���b
					String a = "";
					//��strs1����ת���ַ���a
					for(String j:strs1){
						a += j+"  "; 
					}
					try{
						map.put(strs[4],a);
					}
					catch(Exception e){
						System.out.println("����");
					}
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			Set<String> keySet = map.keySet();
	        Iterator<String> iter = keySet.iterator();
	        while (iter.hasNext()) {
	            String key = iter.next();
	            label1 = new JLabel(map.get(key)+" 	"+key);
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		f.setVisible(true);//��ʾ����
		f.setLocationRelativeTo(null);//�������
	}
}
