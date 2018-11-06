public class Driver extends ArrayMethods {
    public static String printArray(int[] ary){
      if (ary.length == 0) {
	  return "[]";
      }
      else {
	  String output = "[";
	  for (int i = 0; i < ary.length; i++){
	      if (i == ary.length - 1) {
		  output += ary + "]";
		  return output;
	      }
	      output += ary[i] + ", ";
	  }
      }
      return "";
    }
    public static void main(String[] args) {
	int[][] nums = new int[][] {
	    {1,1,1,1},
	    {1,1,1,1},
	    {1,1,1,1},
	    {1,1,1,1}
	};
	int[][] diff = new int[][] {
	    {},
	    {1, 2, 3},
	    {1, 2},
	    {1, 2, 3, 4},
	    {1}
	};
	int[][] magic = new int[][] {
	    {1, 2, 3, 4},
	    {-1, -2, -3, -4}
	};
	int[][] empty = new int[][] {
	    {},
	    {},
	    {}
	};
        int[][] magic2 = new int[][] {
	    {},
	    {1, 2, 3, 43},
	    {-1},
	    {0, -2},
	    {0, 0, -3},
	    {0, 0, 0, -43}
	};
	int[][] magic3 = new int[][] {
	    {1, -1, 1, -1},
	    {2, -2, 2, -2},
	    {3, -3, 3, -3}
	};
	int[][] magic4 = new int[][] {
	    {1, 0, 0, -1},
	    {2,-2},
	    {3, 0, -3}
	};
	for (int i = 0; i < magic2.length; i++){
	    System.out.println(rowSum(magic2, i));
	    System.out.println(columnSum(magic2, i));
	}
    }
}
	    
