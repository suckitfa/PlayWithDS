package Array;

//基于Java的数组二次封装自己的类
/**
 * 增
 * 删
 * 该
 * 查
 * */
public class MyArray {
    private int[] data;
    private int size; // 有效元素的技术
    /**
     * @params capacity
     * */
    public MyArray(int capacity){
        this.data = new int[capacity];
        size = 0;
    }
    // 无参数构造，默认10
    public MyArray() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }
    
    public boolean isEmpty() {
        return size  == 0;
    }


    public boolean isFull() {
        return (size == data.length);
    }
    // 向指定位置添加
    // 将index及其以后的元素往后排
    public void add(int index,int e) {
        if (isFull()) throw new IllegalArgumentException("Add failed. Array is full.");
        if (index < 0 || index >= size ) throw new IllegalArgumentException("Add failed. Required index>=0 and index <= 0.");

        // 将index及其以后的元素往后面移动
        for(int i = size - 1; i >= index; --i) data[i+1] = data[i];
        data[index] = e;
        size ++;
    }

    // 向数组后面增加一个元素
    public void addLast(int e) { add(size,e); }


    // 向第一个位置增加元素
    public void addFirst(int e) { add(0,e);}

    // 查询数组中的元素
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d, capacity = %d\n",size,data.length));
        res.append('[');
        for(int i = 0; i < size;++i) {
            res.append(data[i]);
            if (i != size - 1) res.append(',');
        }
        res.append(']');
        return res.toString();
    }

    public  int get(int index) {
        if (index < 0 || index > size - 1) throw new IllegalArgumentException("Add failed. Required index>=0 and index <= 0.");
        return data[index];
    }

    public void set(int index ,int e) {
        if (index < 0 || index > size - 1) throw new IllegalArgumentException("Add failed. Required index>=0 and index <= 0.");
        data[index] = e;
    }

    // 查询元素是否存在
    public boolean contains(int e) {
        if (find(e) == -1) {
            return false;
        } else {
            return true;
        }
    }

    // 查询元素的位置
    public int find(int e) {
        for(int i = 0; i < size;++i) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public int remove(int index) {
        if (index < 0 || index >= size) throw  new IllegalArgumentException("Remove failed!Index is illegal.");
        int ret = data[index];
        for(int i = 0; i < size;++i) {
            data[i-1] = data[i];
        }
        size --;
        return ret;
    }

    // remove first;
    public int removeFirst() {
        return remove(0);
    }
    // remove last;
    public int removeLast() {return remove(size-1);}
}
