class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        if(m>n) return false;
        int[] arr = new int[26];
        
        for(int i=0;i<n;i++){
            arr[magazine.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<m;i++){
            if(--arr[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
}
