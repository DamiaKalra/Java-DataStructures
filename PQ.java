import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class PQ {
    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;  
        }
    }
    public static void main(String args[]){
       //priority in ascending order
        // PriorityQueue<Integer> pq=new PriorityQueue<>(); 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//priority in descending order
        pq.add(3);//O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(logn)
        }
    }
}
