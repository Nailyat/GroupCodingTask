package coddingTask;

public class Task6Konstantin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10, t1 = 0, t2 = 1;
		System.out.print("First Fibonacci " + n + " numbers: ");
		for (int i = 1; i <= n; ++i)
		{
			System.out.print(t1 + "  ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
