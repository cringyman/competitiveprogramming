
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
#define MAXN  100000000
using namespace std;

const  int N=432;
int lf[N];
map<int,int>  mp;
//prime  //power


void sieve() {  //  first prime factor dial kol nbr
    for(int i = 2; i < N; i += 2)
        lf[i] = 2;
    for(int i = 3; i < N; i += 2)
        if(lf[i] == 0) {
            lf[i] = i;
            for(int j = i + i; j < N; j += i) {
                if(lf[j] == 0)
                    lf[j] = i;
            }
        }
}


void factorize(int n) {

    while(n>1) {

        mp[lf[n]]++;

        n/=lf[n];
    }


}
void defactorize(int n) {
    while(n>1) {
        mp[lf[n]]--;
        n/=lf[n];
    }

}

// nb de factors  a/b
//   a= p1^a * p2^b
//b=p1^c* .....
//  a/b  a-c

int main()
{
    std::ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    int n, k;
    sieve();
    while(cin>>n>>k) {
        ll ans=1;
        for (int i = 0; i<=k-1; ++i)
        {

            // factorize n*(n-1).......(n-k+1)
            // nCk = n*(n-1)......./k!
            factorize(n-i);
        }
        for (int i = 1; i <=k ; ++i)
        {

            defactorize(i);
        }
        if(!(mp.find(2)==mp.end())) {
            ans*=(mp[2]+1);
        }
        //i=2
        for (int i =3 ; i <=435 ; i+=2)
        {
            if(!(mp.find(i)==mp.end())) {
                ans*=(mp[i]+1);
            }
            
        }

 		cout<<ans<<endl;
 			mp.clear();
   
}
        return 0;


    
}

