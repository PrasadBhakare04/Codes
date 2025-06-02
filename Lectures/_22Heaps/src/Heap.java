import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{
    ArrayList<T> list;
    public Heap(){
        list = new ArrayList<>();
    }

    private int parent(int index){
        return  (index - 1) / 2;
    }

    private int left(int index){
        return (2 * index) + 1;
    }

    private int right(int index){
        return (2 * index) + 2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index){
        if(index == 0){
            return;
        }
        //This will check if the new inserted element is smaller than the current parent node or not
        //if it is it will do the swapping till the end
        if(list.get(index).compareTo(list.get(parent(index))) < 0){
            swap(index, parent(index));
            upHeap(parent(index));
        }
    }

    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        //This will check if either left or right is smaller than the parent element
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty list");
        }
        if(list.size() == 1){
            return list.remove(0);
        }
        //This is to get the last element but does not remove the element
        T temp = list.get(0);

        //This will actually remove the element
        //and then check if the list is empty or not
        //if the list is not found to be empty it will put the element back and do the swapping downwards in the heap
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }

        return temp;
    }

    private void swap (int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
