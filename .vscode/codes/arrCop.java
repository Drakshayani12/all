package codes;

import java.net.Socket;

public class arrCop {
    public static void main(String args[]) {
        char cArray[] = { 'j', 'a', 'v', 'a', 'p', 'y', 't', 'h', 'o', 'n' };
        char pArr[] = new char[6];
        System.arraycopy(cArray, 4, pArr, 0, 6);
        for (int i = 0; i < pArr.length; i++) {
            System.out.print(pArr[i]);
        }
        System.out.println();
        char[] c = pArr.clone();
        System.out.println(new String(c));
    }

}
