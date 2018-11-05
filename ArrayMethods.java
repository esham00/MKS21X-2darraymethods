public class ArrayMethods {
    public static int rowSum(int[][] ary, int x) {
	int sum = 0;
	for (int i = 0; i < ary[x].length; i++) {
	    sum += ary[x][i];
	}
    }
    public static int columnSum(int[][] ary, int y) {
	int sum = 0;
	for (int i = 0; i < ary.lengthh; i++) {
	    for (int j = 0; i < ary[j].length; j++) {
		if (j == y) {
		    sum += ary[i][j];
		}
	    }
	}
    }
}
