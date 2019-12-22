import java.util.*;
import java.io.*;

public class Thanos{

    public static boolean isListSorted(List<Integer> list){
        for(int i=1;i<list.size();i++){
            if (list.get(i)<list.get(i-1)) return false;
        }
        return true;
    }

    public static List sortList(List<Integer> list){
        System.out.println(list);
        Iterator itr = list.iterator();
        if(list.size()==1) return list;
        int pos = 0;
        while(itr.hasNext()){
            itr.next();
            if(pos%2!=0) {
                itr.remove();
            }
            pos++;
        }
        if(!isListSorted(list)) return sortList(list);
        return list;
    }

    public static void main(String[] args){
        System.out.println("Thanos - the destroyer of worlds.");
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(98,77,98792,100,42,34,4));
        System.out.println(isListSorted(list));
        System.out.println(sortList(list));
    }
}