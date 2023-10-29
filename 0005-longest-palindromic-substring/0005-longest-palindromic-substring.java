class Solution {
    public String longestPalindrome(String s) {
      if(s.length() == 1) return s;
        String largest = null;
        int longest = Integer.MIN_VALUE;
        int j = s.length() - 1;
        int i = 0;
      while(i < s.length()){
        char a = s.charAt(i);
        char b = s.charAt(j);
        if(i<j){
          if(a == b){
            String temp = palindrome(i, j, s, longest);
            if(temp!=null){
              largest = temp;
              longest = largest.length();
            }
            j--;
          }
          else {
            j--;
          }
        }

        else {
          if (i == s.length()-1) break;
          i++;
          j = s.length() -1;
        }
      }
    if (largest == null) return s.substring(0,1);
    else return largest;
    }
    public String palindrome(int i, int j, String s, int longest){
      int[] temp = {i,j+1};

      while(i<=j){
        if(i < j){
          if(s.charAt(i) == s.charAt(j)){
            i++;
            j--;
          }
          else return null;
        }
        else if(i==j) {
            i++;
            j--;
        }
      }
      
      String largest = s.substring(temp[0],temp[1]);
      if(largest.length()>longest) return largest;
      else return null;
}

}