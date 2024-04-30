package demo;

public class HammingDistance {
public static void main(String[] args) {
	int x=1;
	int y=4;
	System.out.println(hammingDistance( x, y));
}
public static int hammingDistance(int x,int y) {
	return bitCount(x^y);
	
}
public static int bitCount(int n) {
    int count=0;
    while(n>0) {
    	if(n%2==1)
    		count++;
    	n/=2;
    }
    return count;
	
}
}
