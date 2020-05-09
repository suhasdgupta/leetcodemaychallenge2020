class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        double res =Math.sqrt(num) ;
        
        return (res - Math.floor(res)) == 0;
    }
}
// without sqrt function
class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i*i<=num;i++){
            if((num%i ==0) && (i==num/i))
                return true;
        }
        return false;   
    } 
}
