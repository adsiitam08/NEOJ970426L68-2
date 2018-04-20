/**
 *
 * @author jpnegrete
 */
public class Solution {
    public boolean problema(String s){
        if(s == "")
            return false;
        String subs;
        String concat;
        for(int i = 1; i<s.length(); i++){
            subs = s.substring(0, i);
            concat = subs;
            while(concat.length()<=s.length()){
                //System.out.println(subs);
                if(concat.equals(s))
                    return true;
                concat = concat + subs;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        
        System.out.print(sol.problema("abab")); //true
        System.out.print(sol.problema("abba")); //false
        System.out.print(sol.problema("gugus")); //false
        System.out.print(sol.problema("gusugs")); //false
        System.out.print(sol.problema("gusgus")); //true
        System.out.print(sol.problema("gustavogustavogustavo")); //true
        System.out.print(sol.problema("pruebapruebas")); //false
        System.out.print(sol.problema("ahhhhhhhhhhhhhhhha")); //false
        System.out.print(sol.problema("hhhhhhh")); //true
        System.out.print(sol.problema("a___a")); //false
        System.out.print(sol.problema("a_aaa_a")); //false
        System.out.print(sol.problema("holaalo")); //false
        System.out.print(sol.problema("hholahola")); //false
        System.out.print(sol.problema("12341234")); //true
        System.out.print(sol.problema("12_21_12")); //false
        System.out.print(sol.problema("prueba")); //false
        System.out.print(sol.problema("okokok")); //true
        System.out.print(sol.problema("nelnol")); //false
        System.out.print(sol.problema("simonsimon")); //true
        System.out.print(sol.problema("okasdokas")); //false
        
    }
}
