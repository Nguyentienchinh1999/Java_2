package Java_day7.Collection.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {
        Queue<Message> queue = new ArrayDeque<>();
        queue.add(new Message(1,"chinh"));
        queue.add(new Message(2,"thủy"));
        queue.add(new Message(3,"Kien"));
        queue.add(new Message(4,"Thang"));
        queue.add(new Message(5,"TRANg"));

        while (!queue.isEmpty()){
            Message msg = queue.poll();
            System.out.println(msg);
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
