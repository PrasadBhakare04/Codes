package Stack;
//There is no need to use this keyword while using ptr data
// because these are instance variables and each object will have their own instance of that variable
public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;
    private int[] data;

    public CustomStack(int size){
        data = new int[size];
        ptr++;
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
        ptr++;
    }

    public void push(int value) throws StackException{
        if(isFull()){
            throw new StackException("Stack Overflow");
        }
        else{
            ptr++;
            data[ptr] = value;
        }
    }

    public int pop() throws StackException{
        if(this.isEmpty()){
            throw new StackException("Stack Underflow");
        }
        else{
            return data[ptr--];
        }
    }


    private boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }
    private boolean isFull(){
        if(ptr == data.length - 1){
            return true;
        }
        return false;
    }
}
