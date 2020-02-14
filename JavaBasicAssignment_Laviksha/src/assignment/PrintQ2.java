package assignment;

public class PrintQ2 {
	public void printPattern(int n) {
		int space = 2 * (n - 1);
		for (int i = 0; i < n; i++) {

			for (int s = 0; s < space; s++) {
				System.out.print(" ");
			}
			space -= 2;
			int j = i + 1;
			while (j > 0) {
				j--;
				System.out.print(j + " ");

			}
			while (j < i) {
				j++;
				System.out.print(j + " ");
			}
			System.out.println("\n");

		}
	}

	public static void main(String[] args) {
		PrintQ2 p = new PrintQ2();
		p.printPattern(6);
	}

}
