class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int second = s.length() - 1;

        while(second > first){
            char temp = s.charAt(first);
            char temp1 = s.charAt(second);

            if(!Character.isLetterOrDigit(temp))first++;
            else if(!Character.isLetterOrDigit(temp1))second--;
            else if(Character.toLowerCase(temp) != Character.toLowerCase(temp1)) return false;
            else{
                first++;
                second--;
            }
        }
        return true;
    }
}