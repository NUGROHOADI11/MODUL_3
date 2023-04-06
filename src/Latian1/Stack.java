package Latian1;

public class Stack {
    private int maxSize;
    private Long[] stackArray;
    private int top;

    public Stack(int a){
        maxSize = 5;
        stackArray = new Long[maxSize];
        top = -1;
    }
    public void push(long j){
        stackArray[++top] = j;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isPull(){
        return (top == maxSize-1);
    }
}
