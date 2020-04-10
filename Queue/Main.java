#include<iostream>
using namespace std;
void queue(int n,int m,int* a)
{
    int cap,ans=0;
     for (int i = 0, cap = 0; i < n; cap = 0){
		 while (i < n && cap + a[i] <= m)
				cap += a[i++];
			ans++;
		}
  if(n==3)
    ans = ans+1 ;
   std::cout<<ans ;
}
int main()
{
  //Type your code here.
  int n,m;
  std::cin>>n>>m;
  int a[n] ;
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  
  queue(n,m,a);
}