class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        int[] freq=new int[128];
        for(char c:t.toCharArray())
            freq[c]++;
        int left=0;
        int required=t.length();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++)
        {
            char current=s.charAt(right);
            if(freq[current]>0)
                required--;
            freq[current]--;

            while(required==0){
                int currLen=right-left+1;
                if(currLen<minLen)
                {
                    minLen=currLen;
                    start=left;
                }
                char leftChar=s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar]>0)
                {
                    required++;
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}