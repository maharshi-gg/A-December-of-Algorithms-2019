import java.util.*;
import java.io.*;

public class Sevenish {

    static HashMap<Integer, Integer> sevenMap;
    static List<Integer> powerArray;
    int powerNum = 0;

//    public int findMaxPower(int pos){
//        for(int i=0;i<pos;i++){
//            if(pos<Math.pow(2,i)) return i;
//        }
//        return 0;
//    }
//
//    public void populatePowerArray(int powerNum){
//        if(powerArray.length>powerNum) return;
//        else{
//            int i=powerArray.length;
//            for(;i<powerNum;i++){
//                powerArray.append(Math.pow(7,i));
//            }
//        }
//    }
//
//    // function call where the sevenish number will be calculated
//    // and returned.
//    public int sevenish_number(int pos){
//        powerNum = findMaxPower(pos);
//        populatePowerArray(powerNum);
//        int calcNum = 0;
//
//        return 1;
//    }
//

    public static int nthMagicNumber(int n){
        int pow = 1, ans = 0;
        while(n!=0){
            if((int)(n&1) == 1){
                ans+=pow;
            }
            pow=pow*7;
            n>>=1;
        }
        return ans;
    }

    public static void main(String[] args){
        sevenMap = new HashMap<Integer, Integer>();
        powerArray = new ArrayList<Integer>();
        System.out.println(nthMagicNumber(10));
    }
}