package ss10_DSA;

import java.util.Arrays;

public class MyArrayList<E> {
//    Số lượng phần tử trong ArrayList
    private int size=0;
//    Sức chứa của ArrayList
    private static final int DEFAULT_CAPACITY = 10;
//    Mảng chứa các phần tử
    Object elements[];

//    Sức chứa mặc định khi khởi tạo bằng contructor không tham số
    public void ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ArrayList(int capacity){
        if (capacity >= 0){
            elements = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity : "+capacity);
        }
    }

    public MyArrayList(int i) {
    }

    //    Phương thức trả về số lượng phần tử
    int size(){
        return this.size;
    }

//      Phương thức clean ArayList
    private  void clear(){
        size=0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i]=null;
        }
    }
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

//    Phương thức add 1 phần tử vào ss10_arraylist_linkerlist.MyArrayList
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i < index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

//    Phương thức tăng kích thước của ArrayList
public void ensureCapacity(int minCapacity) {
    if (minCapacity >= 0) {
        int newSize = this.elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    } else {
        throw new IllegalArgumentException("minCapacity: " + minCapacity);
    }
}

//    Phương thức lấy 1 element tại phần tử index
    public E get(int index) {
        return (E) elements[index];
    }

//Phương thức truyền vào 1 phần tử kiểm tra xem vị trí đứng thứ mấy trong mảng
public int indexOf(E element) {
    int index = -1;
    for (int i = 0; i < size; i++) {
        if (this.elements[i].equals(element)) {
            return i;
        }
    }
    return index;
}

//    Phương thức kiểm tra xem phần tử có tồn tại trong mảng Không
    public boolean contains(E element) {
        return this.indexOf(element)>=0;
    }

//    Phương thức tạo 1 bản sao
    public MyArrayList<E> clone(){
        MyArrayList<E> v =new MyArrayList<>(10);
        v.elements =Arrays.copyOf(this.elements,this.size);
        v.size =this.size;
        return v;
    }
//    Xoá 1 phần tử trong mảng
    public E remove(int index){
        if (index<0 ||index> elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element =(E) elements[index];
        for (int i = index; i <size-1 ; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }

}
