import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ScoreReader{
	public static void main(String[] args) {
		FileReader myFile = null;
		BufferedReader buff = null;

		try{
			myFile = new FileReader("/home/votako/score.txt");
			buff = new BufferedReader(myFile);

			while(true){
				//read string on score.txt
				String line = buff.readLine();

				//chek end file
				if(line ==null )break;
				System.out.println(line);
			}//end while
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				buff.close();
				myFile.close();
			}catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}//end main
}