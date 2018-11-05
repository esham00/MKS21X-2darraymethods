public class ArrayMethods {
    public static int rowSum(int[][] ary, int x) {
	int sum = 0;
	for (int i = 0; i < ary[x].length; i++) {
	    sum += ary[x][i];
	}
    }
    public static int columnSum(int[][] ary, int y) {
	int sum = 0;
	for (int i = 0; i < ary.length; i++) {
	    for (int j = 0; i < ary[j].length; j++) {
		if (j == y) {
		    sum += ary[i][j];
		}
	    }
	}
    }
    public static int[] allRowSums(int[][] ary) {
	int[] sum = new int[ary.length];
	for (int i = 0; i < ary.length; i++) {
	    sum[i] = rowSum(ary, i);
	}
	return sum;
    }
    public static int[] allColSums(int[][] ary) {
        int l = 0;
	for (int x = 0; i < ary.length; i++) {
	    if (ary[x].length > l) {
		l = ary[x].length;
	    }
	}
	int[] sum = new int[l];
	for (int i = 0; i < l; i++) {
	    sum[i] = columnSum(ary, i);
	}
	return sum;
    }
}
