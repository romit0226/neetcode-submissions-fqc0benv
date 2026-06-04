class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen= new HashSet<>();
        Integer temp=n;
        Integer x=0;

        while(n>0){
            System.out.println("This is temp"+temp);
             temp=returnSq(temp);
             if(seen.contains(temp)){
                return false;
            }
           
            seen.add(temp);

            if(temp==1){
                return true;
            }

           
        }
        return false;
    }
    public int returnSq(int x){
        int sum=0;
        while(x>0){
           int k=x%10;
           sum+=k*k;
           x=x/10;
        }
        return sum;
    }
}
