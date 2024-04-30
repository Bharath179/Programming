package demo;

public class ReverseInteger1 {
public static void main(String[] args) {
	int a=-123;
	System.out.println(reverse(a));
}
public static int reverse(int a) {
    int ans = 0;
    while(a!=0){
        ans = ans*10+a%10;
        a = a/10;
    }
    if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE){
        return 0;
    }
    return (int)ans;
}
}

