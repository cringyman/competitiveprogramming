
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
    #define MAXN 10000000	
	using namespace std;
	
 int uf[MAXN], size[MAXN];  	
	void init(int n){
      
     for (int i = 0; i <n+3 ; ++i)
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

	int main()
	{
		std::ios::sync_with_stdio(false);
	     cin.tie(0);
	     cout.tie(0);
		int n,m;
	     cin>>n>>m;
	     int count=0;
	     init(n);
	     for (int i = 0; i < m; ++i)
	     {
	     	int u,v;
	     	cin>>u>>v;
	     	if(!isConnected(u,v)){
	     	Union(u,v);
             count++;
	     }
	     }
	        cout<<n-count-1<<endl;
	       
 	     

	         for (int j = 1;j <=n ; j++)
	         {
	         	
	         	if(!isConnected(1,j)){
	         		cout<<1<<" "<<j<<endl;
	         		Union(1,j);
	         	}
	         }
	     

		return 0;
}