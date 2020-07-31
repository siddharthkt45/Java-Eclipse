package assignments;

public class MultiplicationTables {

	public static void main(String[] args) {
		System.out.print("x\t");
		for(int k = 1; k<=20; k++) {
			System.out.print(k + "\t");
		}
		System.out.println();
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=20; j++) {
				
				System.out.print("\t" + i*j);
			}
			System.out.println();
		}

	}

}
