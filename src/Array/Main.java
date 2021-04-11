package Array;

import java.sql.Array;

public class Main {
    public static  void main(String [] args) {
        // 声明可以装10个元素的数组
//        int [] arr = new int[10];
//        for(int i = 0; i < arr.length; ++i) {
//            arr[i] = i;
//        }
//
//        int[] scores = new int[] {100,99,66,99,100,200,150};
//        // 可遍历，可迭代
//        for(int score:scores) {
//            System.out.println(score);
//        }

        MyArray arr = new MyArray(20);
        for(int i = 0; i < 10;++i) {
            arr.addLast(i);
        }
        System.out.print(arr.toString());
        arr.add(1,1000);
        System.out.print(arr.toString());
        arr.addFirst(-1);
        System.out.print(arr.toString());

    }

    /**
     * 数组最大的优点就是：随机存取
     * 索引有语义的情况API
     * 如何处理没有语义的一块
     * */
}
