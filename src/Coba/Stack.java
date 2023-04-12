package Coba;

public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int a){
        maxSize = 5;
        stackArray = new String[maxSize];
        top = -1;
    }
    public void push(String j){
        stackArray[++top] = j;
    }
    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isPull(){
        return (top == maxSize-1);
    }
    public int search(String string) {
        return 0;
    }
}
