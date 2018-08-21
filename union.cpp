
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
	#define MAXN 200002
   
	using namespace std;
	int T;
	
    int uf[MAXN], size[MAXN];  	
	void init(int n){
      
     for (int i = 0; i <2*n+5 ; ++i)
     {
           size[i]=1;     	
     	uf[i]=i;
     }
	} 
    
   
	 int find(int x){
   return (uf[x]==x)?x:uf[x]=find(uf[x]);
	// path compression included 
   //O(1)
	 }
	 void Union(int x, int y){
     int a=find(x);
     int b=find(y);

      if(a==b)return;
      else{

        if(size[a]>=size[b]){
        	size[a]+=size[b];
        	uf[b]=a;
        }	
        else{
           size[b]+=size[a];
             uf[a]=b;
        }
      }
	 }
	 bool isConnected(int u, int v){
	 	return (find(u)==find(v));
	 }
	 int Sizeof(int x){
	 	return size[find(x)];
	 } 

	int main()
	{
	  
		//%d integer
		//%c char
		//%s string
        
	  cin>>T;
       while(T--){
       int n;
      cin>>n;
        init(n);

      map<string, int> mp;
        int next=0;
        while(n--){

            string a,b;
              
        	 cin>>a>>b;
             
            
             if(mp.find(a)==mp.end()){
             mp[a]=next++;}
               if(mp.find(b)==mp.end()){
             mp[b]=next++;}
             Union(mp[a], mp[b]);
           //  cout<<mp[a]<<" "<<mp[b]<<endl;
           cout<<Sizeof(mp[a])<<endl;    
        }


       }


	

		return 0;
	}
