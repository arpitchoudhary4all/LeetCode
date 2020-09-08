/*
Implement atoi which converts a string to an integer.
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
If the first sequence of non-whitespace characters in str is not a valid integral number, 
or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
If no valid conversion could be performed, a zero value is returned.
*/
class Solution {
    public int myAtoi(String str) {
        char chars[] = str.toCharArray();
        int i=0;
        int j=chars.length-1;
        boolean isNegative = false;
        while(i<=j&&(chars[i]==' '||chars[j]==' ')){
            if(chars[i]==' ')
                i++;
            if(chars[j]==' ')
                j--;
        }
        if(i>=chars.length) return 0;
        if(chars[i]=='+'){
            i++;
        } else if(chars[i]=='-'){
            i++;
            isNegative = true;
        }
        double num = 0;
        while(i<=j&&Character.isDigit(chars[i])){
             num = num*10+chars[i]-'0';
             i++;
        }
        if(isNegative) num = -num;
        if(num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)num;
    }
}
