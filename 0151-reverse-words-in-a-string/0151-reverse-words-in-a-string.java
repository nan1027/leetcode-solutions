//first solution
import java.util.*;

class Main {

    public static String reverseWords(String s){
        String[] words=s.split(" ");
        StringBuilder sb= new StringBuilder();
        
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            
            if(i!=0){
            sb.append(" ");
                
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }
}
//second solution

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int j=i;
            while(j>=0 && s.charAt(j)!= ' '){
                j--;
            }
            sb.append(s.substring(j+1,i+1));

            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            if(j>=0){
               sb.append(' ');
            }
            i=j;
        }
        return sb.toString();
    }
}
