//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

// } Driver Code Ends


class MyStack {
    class StackNode {
        int data;
        StackNode next;
        
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    
    StackNode top;

   
    void push(int a) {
        StackNode newNode = new StackNode(a);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
       
    }

    int pop() {
        if (top == null) {
           
            return -1;
        }

        int poppedElement = top.data;
        top = top.next;
        return poppedElement;
    }
}
