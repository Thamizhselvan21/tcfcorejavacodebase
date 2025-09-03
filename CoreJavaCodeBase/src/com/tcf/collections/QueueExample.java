package com.tcf.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements using add()
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Adding element using offer()
        queue.offer("Fourth");

        // Displaying queue
        System.out.println("Queue: " + queue);

        // Accessing head using peek() (does not remove)
        System.out.println("Peek (head element): " + queue.peek());

        // Accessing head using element() (throws exception if queue is empty)
        System.out.println("Element (head element): " + queue.element());

        // Removing element using poll() (returns null if queue is empty)
        System.out.println("Removed using poll(): " + queue.poll());

        // Removing element using remove() (throws exception if queue is empty)
        System.out.println("Removed using remove(): " + queue.remove());

        // Queue after removals
        System.out.println("Queue after removals: " + queue);

        // Checking the size
        System.out.println("Size of the queue: " + queue.size());

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Clearing the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
