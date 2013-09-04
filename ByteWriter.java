import java.io.FileInputStream;
import java.io.*;

public class ByteReader{
	public static void print(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		FileInputStream myFile = null;
		try{
			//open byte stream, indicatin file
			myFile = new FileInputStream("/home/votako/soft.txt");

			while (true) {
				int intValueOfByte = myFile.read();
					print(" " + intValueOfByte);
					if (intValueOfByte == -1) {
						//end file
						break;
					}
			}
		}catch (IOException e) {
			print("cant"+e.toString());
		}finally{
			try{
				myFile.close();
			}catch (Exception e1) {
				e1.printStackTrace();
			}
			print("eah");
		}
	}
}