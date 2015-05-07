

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.HashMap;



public class test4float2string {
	public static void main(String args[]) throws Exception{
		
			
			String s1;
			String path="E:\\1.txt";
			File file=new File(path);
			InputStream in =new FileInputStream(file);
			String reg="";
			
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			//BufferedReader inbuffer = new BufferedReader(new InputStreamReader(in));
			BufferedReader br = new BufferedReader(reader);
			while ((s1=br.readLine())!=null){
				String[] line1 = s1.split("\\s+");
				
				float fs=Float.parseFloat(line1[2]);
				String da="";
				}
			br.close();
			in.close();
		//}
		//catch (Exception e) {e.printStackTrace();  
		
		
	//}
		}
		}
	

