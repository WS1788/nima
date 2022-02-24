package breakLable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lable:for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue lable;
				}
				System.out.print("j:"+j);
			}
			System.out.print("i:"+i);
		}
	}

}
