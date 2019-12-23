import java.util.*;
import java.io.*;

public class QueuedUp{

    static class Element{
        int token;
        String id;
        Element(int token, String id){
            this.token = token;
            this.id = id;
        }

        public String getId(){
            return this.id;
        }

        public int getToken(){
            return this.token;
        }
    }

    public static void main(String[] args){
        System.out.println("if the Queue changes, then Thanos shall be called! ");
        System.out.println("Enter the number of elements in the queue:");
        Scanner scan = new Scanner(System.in);
        int numElements = scan.nextInt();
        scan.nextLine();
        Stack<Element> stack = new Stack<Element>();
        for(int i=0;i<numElements;i++){
            String line = scan.nextLine();
            int tokenNum = Character.getNumericValue(line.charAt(1));
            String id = line.substring(4,line.length()-1);
            stack.push(new Element(tokenNum,id));
        }
        System.out.println("Initial Stack looks like - ");
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i).getToken() + ", " + stack.get(i).getId());
        }
        System.out.println("Enter the id of element to bump up - ");
        String bumpUp = scan.nextLine();
        Element tempElement = null;
        Stack<Element> tempStack = new Stack<Element>();
        while(!stack.isEmpty()){
            if(stack.peek().getId().equals(bumpUp)){
                tempElement = stack.peek();
                stack.pop();
            }
            tempStack.push(stack.pop());
        }
        if(tempElement==null){
            System.out.println("element not found,");
            return;
        }
        stack.push(tempElement);
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        System.out.println("Now the final stack looks like - ");
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i).getToken() + ", " + stack.get(i).getId());
        }
        System.out.println("Done done done.");

    }
}