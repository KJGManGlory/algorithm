package com.lizza.Queue;

/**
 * 队列的最大值
 */
public class MaxQueue {

    private Integer[] data;
    private int push_index;
    private int pop_index;
    private int max;

    public MaxQueue() {
        this.data = new Integer[10000];
        this.max = -1;
        this.push_index = -1;
        this.pop_index = 0;
    }

    public int max_value() {
        if (data[pop_index] == null)
            return  -1;

        return max;
    }

    public void push_back(int value) {
        if (value >= max)
            data[++push_index] = max = value;

        data[++push_index] = value;
    }

    public int pop_front() {
        if (data[pop_index] == null)
            return -1;

        if (data[pop_index] == max)
            max = data[++pop_index];

        return data[pop_index++];
    }

    public static void main(String[] args){
        MaxQueue queue = new MaxQueue();
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        queue.push_back(46);
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        System.out.println(queue.max_value());
        System.out.println(queue.pop_front());
        queue.push_back(868);
    }
}
