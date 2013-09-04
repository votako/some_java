public class math{
	int one=1;
	//, two, tree, fore, five = 1;
	int changeOne(){ 
		for (int i=1; i<=45; i++) {
			one=one+1; 
		}
		return one;
	}
	//int changeTwo(){ two=two+2; return two;}
	//int changeTree(){ tree=tree+3; return tree;}
	//int changeFore(){ fore=fore+4; return fore;}
	//int changeFive(){ five=five+5; return five;}

	
	//for(int i=1;i<=90;i+=2){}
	public static void main(String[] args) {
		math m = new math();
		for (int i=1; i<=45; i++) {
			System.out.println(m.changeOne());
		}

			
	}
}
