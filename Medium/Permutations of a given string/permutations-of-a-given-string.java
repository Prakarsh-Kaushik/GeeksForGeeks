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
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        List<String> result = new ArrayList<>();
        char[] charArray = S.toCharArray();
        Arrays.sort(charArray); 
        boolean[] used = new boolean[S.length()];
        backtrack(charArray, used, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(char[] charArray, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == charArray.length) {
            result.add(current.toString());
            return;
        }
        
        for (int i = 0; i < charArray.length; i++) {
            if (used[i] || (i > 0 && charArray[i] == charArray[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.append(charArray[i]);
            backtrack(charArray, used, current, result);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}