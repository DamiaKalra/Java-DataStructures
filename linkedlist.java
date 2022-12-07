public class linkedlist {
    public static class Node{
        int data;
        Node next;  //reference variable
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        //step1= ceate new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2-newNode next=head
        newNode.next=head; //link
        //step3-head=newNode
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print(){
            if(head==null){
                System.out.println("LL is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void add(int idx,int data){
            if(idx==0){
                addfirst(data);
                    return;
                }
                size++; 
            Node newNode=new Node(data);
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            //i =idx-1; temp->prev
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public int removefirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--; 
            return val;
        }

        public int removelast(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
           //prev : i=size-2
           Node prev=head;
           for(int i=0;i<size-2;i++){
            prev=prev.next;
           }
           int val=prev.next.data; //tail.data
           prev.next=null;
           tail=prev;
           size--;
           return val;
        }

        public int itrSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){ //key found
                    return i;
                }
                temp=temp.next;
                i++;
            }
            //key not found
            return -1;
        } 
        public int helper(Node head, int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head,key);
        }
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public void deletenthfromend(int n){
            //calculate size
            int sz=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(n==size){
                head=head.next; //remove first
                return;
            }
            //sz-n
            int i=1;
            int itofind=sz-n;
            Node prev=head;
            while(i<itofind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
        public Node findmid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next; //+1
                fast=fast.next.next; //+2
            }
            return slow; // slow is midNode
        }
        public boolean checkpalindrome(){
            if(head==null||head.next==null){
                return true;
            }
            //step1-find mid
            Node midnode=findmid(head);
            //step2-revrese 2nd half
            Node prev=null;
            Node curr=midnode;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node right=prev; //right half head
            Node left=head;
            //step3-check left half and right half
            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
        }
    public static void main(String args[]){
        linkedlist ll=new linkedlist();
        // ll.head=new Node(1);
        // ll.head.next=new Node(2);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.addlast(5);
        ll.print();
        ll.addlast(4);
        ll.add(2,9); 
        ll.print();
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        System.out.println(ll.recSearch(5));
        ll.reverse();
        ll.print();
        ll.deletenthfromend(3);
        ll.print();
        System.out.println(ll.checkpalindrome());;
    }
}
  