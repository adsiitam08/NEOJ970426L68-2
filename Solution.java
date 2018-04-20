/**
 *
 * @author jpnegrete
 */
public class Solution {
    public boolean problema(String s){
        String subs;
        String concat;
        for(int i = 1; i<s.length(); i++){
            subs = s.substring(0, i);
            concat = subs;
            while(concat.length()<=s.length()){
                System.out.println(subs);
                if(concat.equals(s))
                    return true;
                concat = concat + subs;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        
        System.out.print(sol.problema("abab"));
        System.out.print(sol.problema("abba"));
        System.out.print(sol.problema("gugus"));
        System.out.print(sol.problema("gusugs"));
        System.out.print(sol.problema("gusgus"));
        System.out.print(sol.problema("gustavogustavogustavo"));
        System.out.print(sol.problema("pruebapruebas"));
        System.out.print(sol.problema("ahhhhhhhhhhhhhhhha"));
        System.out.print(sol.problema("hhhhhhh"));
        System.out.print(sol.problema("a___a"));
        System.out.print(sol.problema("a_aaa_a"));
        System.out.print(sol.problema("holaalo"));
        System.out.print(sol.problema("hholahola"));
        System.out.print(sol.problema("12341234"));
        System.out.print(sol.problema("12_21_12"));
        System.out.print(sol.problema("prueba"));
        System.out.print(sol.problema("okokok"));
        System.out.print(sol.problema("nelnol"));
        System.out.print(sol.problema("simonsimon"));
        System.out.print(sol.problema("okasdokas"));
        
    }
}
