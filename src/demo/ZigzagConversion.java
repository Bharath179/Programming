package demo;


public class ZigzagConversion {
	  public static String convert(String s, int numRows) {
	        if (numRows == 1 || numRows >= s.length()) {
	            return s;
	        }

	        StringBuilder[] rows = new StringBuilder[numRows];
	        for (int i = 0; i<numRows; i++) {
	            rows[i] = new StringBuilder();
	        }

	        int index = 0;
	        int direction = 1; // 1 for down, -1 for up

	        for (char c : s.toCharArray()) {
	            rows[index].append(c);

	            if (index == 0) {
	                direction = 1;
	            } else if (index == numRows - 1) {
	                direction = -1;
	            }

	            index += direction;
	        }

	        StringBuilder result = new StringBuilder();
	        for (StringBuilder row : rows) {
	            result.append(row);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String input = "PAYPALISHIRING";
	        int numRows = 3;
	        System.out.println(convert(input, numRows));
	    }
	}
