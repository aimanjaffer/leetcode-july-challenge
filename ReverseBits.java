public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    	String s = Integer.toBinaryString(n);
    	while (s.length() < 32) {
            s = "0" + s;
    	}
    	char[] chars = s.toCharArray();
    	char temp;
    	for(int head = 0, tail = s.length()-1; head < tail; head++, tail--) {
    		temp = chars[head];
    		chars[head] = chars[tail];
    		chars[tail] = temp;
    	}
    	String resultString = new String(chars);
    	long result = Long.parseLong(resultString,2);
        return (int)result;
    }
}