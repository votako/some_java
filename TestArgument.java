public class TestArg{
	public static void main(String[] args) {
		int num = args.length;
		for (int i=0; i<num; i++) {
			System.out.println(args[i]);
		}
	}
}