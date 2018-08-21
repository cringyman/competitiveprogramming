
	#include <bits/stdc++.h>
	#include <cstdio>
	#include <cstring>
	#include <cmath>
	#include <cstring>
	#include <chrono>
	#include <complex>
	#define endl "\n"
	#define ll long long int
	#define vi vector<int>
	#define vll vector<ll>
	#define vvi vector < vi >
	#define pii pair<int,int>
	#define pll pair<long long, long long>
	#define mod 1000000007
	#define inf 1000000000000000001;
	#define all(c) c.begin(),c.end()
	#define mp(x,y) make_pair(x,y)
	#define mem(a,val) memset(a,val,sizeof(a))
	#define eb emplace_back
	#define f first
	#define s second
	
	using namespace std;
	 

     string s;
     int l;

     bool check(int n){
      n=l/n;
     	//nb de chars in then base substring 
      for (int i = 0; i <n ;i++)
      {
      	
         for (int j = i+n; j <l ; j+=n)
         {
         	if(s[i]!=s[j])
      		return false;
      	}} 
      
      return true;

     }
	int main()
	{
	     
        while(cin>>s&&s[0]!='.'&&s.length()!=1){
        //3andak string 
        	 l=s.length();
        	int n=l+1;
        	while(n-->2){
             if(l%n==0) continue;
              if(check(n))break;   

        	}
            cout<<n<<endl;    


        }




		return 0;
	}
