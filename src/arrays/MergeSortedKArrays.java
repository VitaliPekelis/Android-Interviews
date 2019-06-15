package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Arrays;


public class MergeSortedKArrays {

    public static int[] mergeSortedArrays(int[] ...arrays){

        Comparator<ArrayContainer> comparator = (ArrayContainer o1, ArrayContainer o2) -> Integer.compare(o1.array[o1.index], o2.array[o2.index]);

        PriorityQueue<ArrayContainer> priorityQueue = new PriorityQueue<>(arrays.length, comparator);

        int lengthResult = 0;

        //insert arrays to queue
        for (int[] array: arrays){
            priorityQueue.add(new ArrayContainer(array, 0));
            lengthResult += array.length;
        }

        int[] result = new int[lengthResult];
        int indexResult = 0;

        while(!priorityQueue.isEmpty()){

            ArrayContainer container = priorityQueue.poll();

            result[indexResult++] = container.array[container.index];

            if(container.index < container.array.length - 1){
                container.index++;
                priorityQueue.add(container);
            }
        }

        return result;
    }

    //helper object
    public static class ArrayContainer {
        private int[] array;
        private int index;

        public ArrayContainer(int[] array, int index) {
            this.array = array;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 3, 5, 7},new int[]{0, 1, 8, 10, 11, 12, 13}, new int[]{2, 4, 6, 8}, new int[]{-11, -9, 0,  10})));
    }

}