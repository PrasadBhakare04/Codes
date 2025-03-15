package _11Generics;

public class _2CustomGenArrayList<T> {
    private final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    _2CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }
    public void remove(){
        size--;
    }
    public void size(){
        System.out.println(this.size);
    }

    public int get(int index){
        return (int)(data[index]);
    }
    private boolean isFull(){
        return size == DEFAULT_SIZE;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString(){
        String s = " ";
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if(i < size - 1){
                System.out.print(data[i]+", ");
            }
            if(i == size - 1){
                System.out.print(data[i]);
            }
        }
        System.out.print("]");
        return s;
    }
}
