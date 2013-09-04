import java.io.*;

public class FileCopy{
	public static void main(String[] args) {
		//how many received args?
		if (args.length != 2) {
			System.out.println("enter the args");
			System.out.println("like java FileCopy /home/user/test.txt /home/user/Documents/test.txt");
		}else {
			int numberOfArgs = args.length;

			for (int i=0; i<numberOfArgs; i++) {
				System.out.println("copy " + args[0] + " to " + args[1]);
			}
		}
		//make copy file
		FileReader fileFromCopy=null;
		BufferedReader buffFromCopy=null;
		//make file to copy
		FileWriter fileToCopy=null;
		BufferedWriter buffToCopy=null;

		try{
			//file
			fileFromCopy = new FileReader(args[0]);
			fileToCopy = new FileWriter(args[1]);
			//buff
			buffFromCopy = new BufferedReader(fileFromCopy);
			buffToCopy = new BufferedWriter(fileToCopy);

			while (true) {
				//read all line from args[0]
				String line = buffFromCopy.readLine();

				// for (int c=0; c<args.length; c++) {
					buffToCopy.write(line);
					System.out.println("write "+ args[0]);
				
				//chek end of file
				if (line == null)break; 
					
				System.out.println(line);
			}//end while

		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				buffToCopy.close();
				buffFromCopy.close();
				fileToCopy.close();
				fileFromCopy.close();
			}catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}//end main
}