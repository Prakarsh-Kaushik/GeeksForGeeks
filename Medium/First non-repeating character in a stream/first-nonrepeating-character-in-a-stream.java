//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public String FirstNonRepeating(String A) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            char firstNonRepeating = '#';
            for (char ch : charCount.keySet()) {
                if (charCount.get(ch) == 1) {
                    firstNonRepeating = ch;
                    break;
                }
            }

            result.append(firstNonRepeating);
        }

        return result.toString();
    }
}