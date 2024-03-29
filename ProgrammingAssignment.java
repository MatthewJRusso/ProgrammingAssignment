import javax.swing.*;
import java.util.Stack;

 public class ProgrammingAssignment {

     public static void main(String args[]){

         int maxSize;
         int top;
         string[] userArray = System.out.println("Enter text");
         string[] stackArray; 
         
         for(int i = 0; i < userArray.length; i++){
            if( i == '('){
                 stackArray.push(')'); 
            }
            if(userArray == ")"){
                stackArray.pop(i);
            }
            else{
                System.out.println("Error");
            }
            if( i == '['){
                stackArray.push(']'); 
           }
           if(userArray == "]"){
               stackArray.pop(i);
           }
           else{
               System.out.println("Error");
           }

           if( i == '{'){
            stackArray.push('}'); 
            }

            if(userArray == "}"){
                stackArray.pop(i);
            }
            else{
                System.out.println("Error");
            }

            if(userArray.isEmpty()){
                System.out.println("Error");
            }
         }
    }
         public ProgrammingAssignment( int a ){
            maxSize = a; 
            stackArray = new string[maxSize];
            top = -1;
        }
        
        public void push(String a){
            stackArray[++top]= a;
        
        }
        public long pop(){
            return stackArray[top--];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public boolean isFull(){
            return(top==maxSize -1);
        }


}

