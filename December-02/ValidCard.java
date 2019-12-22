public class ValidCard {

    public static int digitSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static boolean isValidCC(String cc){
        cc = new StringBuilder(cc).reverse().toString();
        System.out.println(cc);
        int s1=0, s2=0;
        int num=0;
        for(int i=0;i<cc.length();i++){
            num = cc.charAt(i) - '0';
            if(i%2==0){
                s1+=num;
            }
            else s2+=digitSum(2*num);
            System.out.println("i-"+i+", num-"+num+", s1-"+s1+", s2-"+s2);
        }
        if((s1+s2)%10==0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isValidCC("61789372994"));
    }
}