public class test{
	test(){
		divideByZero();
	}

	int divideByZero(){
		return 25/0;
	}

	public static void main(String[] args){
		new test();
	}
}
