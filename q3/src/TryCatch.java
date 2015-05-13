import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TryCatch {
	public static void main(String args[]) throws Exception{
		String s1;
		String path="E:\\example-input.txt";
		File file=new File(path);
		InputStream in =new FileInputStream(file);
		String reg="";
		
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		//BufferedReader inbuffer = new BufferedReader(new InputStreamReader(in));
		BufferedReader br = new BufferedReader(reader);
		
		File writename = new File("E:\\output.txt");
		writename.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(writename));
		
		
		while ((s1=br.readLine())!=null){
			String s2=s1;
			String[] line1 = s2.split("\\s+");
			
			try{
			float fs=Float.parseFloat(line1[2]);
			float fs1 =5;
			int c=3;
			float c1 =fs1/c;
			DecimalFormat df = new DecimalFormat("0.000");
			String s = df.format(c1);
			System.out.println(fs1/c);
			System.out.println(s);
			//String da="";
			out.write(line1[0]+" "+line1[1]+" "+line1[2]+" "+fs+"\n");
			out.flush(); // 把缓存区内容压入文件
			}
			
			catch (java.lang.NullPointerException  e)
			{ 
				e.printStackTrace(); 
				System.out.println("the string is null" + e);
			}
			catch (java.lang.NumberFormatException e)
			{
				//e.printStackTrace(); 
				System.out.println("the string does not contain a parsable" + e);
			}
			catch (java.lang.ArrayIndexOutOfBoundsException e)
			{
			System.out.println("arrayINdexoutofbounds" + e);
			}
		}
		br.close();
		in.close();
		out.close();
		
		
		
		
	}
}
