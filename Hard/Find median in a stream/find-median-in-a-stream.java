//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}


// } Driver Code Ends


class Solution {
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    public static void insertHeap(int x) {
        if (maxHeap.isEmpty() || x <= maxHeap.peek()) {
            maxHeap.add(x);
        } else {
            minHeap.add(x);
        }
        balanceHeaps();
    }
    
    public static void balanceHeaps() {
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public static double getMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return maxHeap.peek();
        }
    }
}