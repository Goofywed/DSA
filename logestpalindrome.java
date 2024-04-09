public class logestpalindrome {
    static String logestplaindrome(String str){
        if (str.length()<=1) return str;

        String lsp="";
         for (int i=1;i<str.length();i++){
             int low=i;
             int high=i;
             while (str.charAt(low) ==str.charAt(high)) {
                 low--;
                 high++;
                 if (low == -1 || high == str.length()) break;
             }
                 String palindrom=str.substring(low+1,high);
                 if (palindrom.length()>lsp.length()){
                     lsp=palindrom;

             }


         low=i-1;
         high=i;
         while (str.charAt(low) ==str.charAt(high)){
             low--;
             high++;
             if (low==-1 || high==str.length()) break;
         }
         palindrom=str.substring(low+1,high);

         if (palindrom.length()>lsp.length()){
             lsp=palindrom;
         }

         }
         return lsp;
    }

    public static void main(String[] args) {
        String str="ebbabad";
        String r=logestplaindrome(str);
        System.out.println(r);
    }
}
