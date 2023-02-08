//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
public:
	public:
		int find_median(vector<int> v)
		{
		    // Code here.
		   sort(v.begin(), v.end());
		    int size = v.size();
		    int index = (size - 1) / 2;
		    int res;
		    if(size % 2 != 0){
		        res = v[index];
		    }
		    else{
		        res = (v[index] + v[index + 1]) / 2;
		    }
		    return res;
		 
		}
};

//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	vector<int> v(n);
    	for(int i = 0; i < n; i++)
    		cin>>v[i];
    	Solution ob;
    	int ans = ob.find_median(v);
    	cout << ans <<"\n";
    }
	return 0;
}

// } Driver Code Ends