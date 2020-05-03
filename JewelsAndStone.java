class JewelsAndStone {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<S.length();i++){
            boolean flag  = J.contains(String.valueOf(S.charAt(i)));
            if(flag)
                count++;
        }
        return count;
    }
}
