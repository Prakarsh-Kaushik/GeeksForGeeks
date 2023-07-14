//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG {
    int minElement;
    Stack<Integer> stack;

  
    GfG() {
        stack = new Stack<>();
    }

    int getMin() {
        if (stack.isEmpty()) {
            return -1;
        }

        return minElement;
    }

    int pop() {
        if (stack.isEmpty()) {
            return -1;
        }

        int poppedElement = stack.pop();

        if (poppedElement < minElement) {
            int prevMinElement = minElement;
            minElement = 2 * minElement - poppedElement;
            return prevMinElement;
        }

        return poppedElement;
    }

    void push(int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            minElement = x;
        } else {
            if (x < minElement) {
                stack.push(2 * x - minElement);
                minElement = x;
            } else {
                stack.push(x);
            }
        }

    }
}

