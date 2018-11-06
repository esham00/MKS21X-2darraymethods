public class ArrayMethods {
    public static int rowSum(int[][] ary, int x) {
	if (x > ary.length-1) {return 0;}
	int sum = 0;
	for (int i = 0; i < ary[x].length; i++) {
	    sum += ary[x][i];
	}
	return sum;
    }
    public static int columnSum(int[][] ary, int y) {
	int l = 0;
	for (int x = 0; x < ary.length; x++) {
	    if (ary[x].length > l) {
		l = ary[x].length;
	    }
	}
	if (y > l-1) {return 0;}
	int sum = 0;
	for (int i = 0; i < ary.length; i++) {
	    if (!(ary[i].length-1 < y)) {
		sum += ary[i][y];
	    }
	} 
	return sum;
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
	for (int x = 0; x < ary.length; x++) {
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
    public static boolean isRowMagic(int[][]ary) {
	int[]arrayOfSums = allRowSums(ary);
	int sum = 0;
	for (int i = 0; i < arrayOfSums.length; i++) {
	    sum += arrayOfSums[i];
	}
	if (sum == 0) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public static boolean isColumnMagic(int[][] ary) {
	int[] arrayOfSums = allColSums(ary);
	int sum = 0;
	for (int i = 0; i < arrayOfSums.length; i++) {
	    sum += arrayOfSums[i];
	}
	if (sum == 0) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
