import java.util.*;

class ArrayListThread extends Thread {
    public void run() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Teddy");
        arrayList.add("Apple");
        arrayList.add("Doll");
        System.out.println("ArrayList: " + arrayList);
    }
}

class LinkedListThread extends Thread {
    public void run() {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bunny");
        System.out.println("LinkedList: " + linkedList);
        linkedList.remove("Dog");
        System.out.println("List:"+ linkedList);
        System.out.println("List size:"+linkedList.size());
    }
}

class StackThread extends Thread {
    public void run() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(25);
        stack.push(15);
        System.out.println("Stack: " + stack);
        System.out.println("Stack:"+stack.pop());
    }
}

class VectorThread extends Thread {
    public void run() {
        Vector<Double> vector = new Vector<>();
        vector.add(1.1);
        vector.add(2.3);
        vector.add(4.1);
        System.out.println("Vector: " + vector);
    }
}

public class ListSample {
    public static void main(String[] args) {
        ArrayListThread arrayListThread = new ArrayListThread();
        LinkedListThread linkedListThread = new LinkedListThread();
        StackThread stackThread = new StackThread();
        VectorThread vectorThread = new VectorThread();

        arrayListThread.start();
        linkedListThread.start();
        stackThread.start();
        vectorThread.start();
    }
}