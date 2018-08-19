#include <bits/stdc++.h>

using namespace std;

typedef long long ll;


int main(){
	int mi=1e8;
int n;
cin>>n;
int a[n];
for(int i=0;i<n;i++){
	cin>>a[i];
}
sort(a,a+n);

for(int i=1;i<n-1;i++){
	mi=min(abs(a[i]-a[i-1]),mi);
    mi=min(abs(a[i]-a[i+1]),mi);
}
cout<<mi<<endl;
return 0;
}
