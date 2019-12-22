import java.util.*;
import java.io.*;

public class Hindex {

    public static int h_index(int num, ArrayList<Integer> citations){
        if(citations==null)
            return 0;
        else{
            Collections.sort(citations);
            System.out.println(citations);
            int length = citations.size();
            for(int i=(length-1);i>0;i--){
                if(citations.get(i)<=citations.size()-i) return citations.get(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> citations = new ArrayList<Integer>(Arrays.asList(4,3,0,1,5));
        ArrayList<Integer> citations2 = new ArrayList<Integer>(Arrays.asList(4,5,2,0,6,4));
        System.out.println(h_index(citations2.size(), citations2));
    }
}