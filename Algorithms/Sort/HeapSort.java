package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSort {

    public void heapSort(int[] array){
        //升序排列使用最大堆
        for(int i = array.length/2-1; i>= 0; i--){
            //构建堆
            adjustHeap(array, i, array.length);
        }
        for(int i = array.length-1; i > 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            adjustHeap(array, 0, i);
        }
    }

    public void adjustHeap(int[] array, int i, int length){
        //取出当前的值
        int tmp = array[i];
        //k是当前节点的左子节点
        for(int k = i * 2 + 1; k < length; k = k * 2 + 1){
            if(k + 1 < length && array[k] < array[k+1]){
                //左子小于右子
                k++;//指向右子
            }
            if(array[k] > tmp){
                //子大于父,大的值给父
                array[i] = array[k];
                i = k;
            }else break;
        }
        array[i] = tmp;
    }

    public void queueSort(int[] array){
        //优先队列默认是小顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//小顶堆
            }
        });
        for(Integer i : array){
            queue.add(i);
        }
        for(int i = 0; i < array.length; i++){
            array[i] = (int)queue.poll();
        }
//        System.out.println(Arrays.toString(array));
    }
}
