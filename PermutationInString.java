class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        if(n1>n2)
            return false;
        int[] arr = new int[26];
        for(int i=0;i<n1;i++)
            arr[s1.charAt(i)-'a']++;
        int[] brr = new int[26];
        for(int i=0;i<n2;i++){
            brr[s2.charAt(i)-'a']++;
            if(i>=n1) brr[s2.charAt(i-n1)-'a']--;
            if(Arrays.equals(arr,brr)) return true;
        }
        return false; 
    }
}
