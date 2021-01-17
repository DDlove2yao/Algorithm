package Sort;

public class InsertSort {
    public int[] sort(int[] array){
        int len = array.length;
        for(int i = 1; i < len; i++){
            //要插入的数
            int insert = array[i];
            //插入的索引
            int index = i - 1;
            //移动索引到插入的位置
            while(index >= 0 && array[index] > insert){
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = insert;
        }
        return array;
    }
}
