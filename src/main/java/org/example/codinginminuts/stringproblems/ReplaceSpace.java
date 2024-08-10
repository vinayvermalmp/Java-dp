package org.example.codinginminuts.stringproblems;

/*
* I/P -> hello world how are you?
* O/P -> hello%20world%20how%20are%20you?
* */
public class ReplaceSpace {

    public static String replace_space(char[] str) {
        // calculate space
        int spaces = 0;
        for (int i = 0; i <= str.length-1; i++){
            if (str[i] == ' ') {
                spaces +=1;
            }
        }
        int idx = str.length + 2 * spaces;
        // System.out.println(idx);
        char[] old_str = str;
        str = new char[idx]; // new string with new length
        for (int i = old_str.length-1; i>= 0; i--) {
            if (old_str[i] == ' ') {
                str[idx-1] ='0';
                str[idx-2] ='2';
                str[idx-3] ='%';
                idx -=3;
            }else {
                str[idx-1] = old_str[i];
                idx--;
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
       char[] chr = "hello world how are you?".toCharArray();
        System.out.println(replace_space(chr));
      /* chr = replace_space(chr);
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
        }*/
    }

}
