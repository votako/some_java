import java.io.FileInputStream;
import java.io.*;

public class ByteReader{
	static int somedata[] = {123,15,2134,621,1};
	public static void print(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		BufferedOutputStream buff =null;
		FileOutputStream myFile = null;
		try{
			//open byte stream, indicatin file
			myFile = new FileOutputStream("/home/votako/WHAAT.txt");
			buff = new BufferedOutputStream(myFile);
			for (int i=0; i<somedata.length; i++) {
				buff.write(somedata[i]);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				buff.flush();
				buff.close();
				myFile.close();
			}catch (Exception e1) {
				e1.printStackTrace();
			}
			print("eah");
		}
	}
}