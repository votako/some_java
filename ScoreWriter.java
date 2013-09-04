import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ScoreWriter{
	public static void main(String[] args) {
		FileWriter myFile = null;
		BufferedWriter buff = null;

		String[] scores = new String[3];
		scores[0] = "asd";
		scores[1] = "zxc";
		scores[2] = "qwe";
		try{
			myFile = new FileWriter("/home/votako/scores.txt", true);
			buff = new BufferedWriter(myFile);

			for (int i=0; i<scores.length; i++) {
				buff.write(scores[i]);
				System.out.println("write: "+scores[i]);
			}
			System.out.println("complite");
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				buff.flush();
				buff.close();
				myFile.close();
			}catch (IOException e1) {
			e1.printStackTrace();
			}
		}
	}//end main;
}