//{ Driver Code Starts
#include<iostream>
#include<string.h>
using namespace std;


// } Driver Code Ends
/*Complete the function below*/

class Solution {
public:
    int PalinArray(int a[], int n)
    {
    	for(int i=0; i<n; i++)
    	{ int element = a[i];
    	int rem=0, rev=0;
    	    while(a[i]>0)
    	    {
    	        rem = a[i]%10;
    	        rev = rev*10+ rem;
    	        a[i]= a[i]/10;
    	    }     
    	    if(element==rev)
    	   continue;
    	    else
    	    return 0;
    	}
    	return 1;
    	
    }
    
};

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i = 0; i < n; i++)
			cin>>a[i];
		Solution obj;
		cout<<obj.PalinArray(a,n)<<endl;
	}
}
// } Driver Code Ends