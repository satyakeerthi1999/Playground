#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a;
  std::cin>>n>>a ;
  int t[n] ;
  for(int i=0;i<n;i++)
    std::cin>>t[i] ;
  int s = 0;
  for(int i=0;i<n;i++)
  {
    s = s+t[i] ;
  }
  if(s <= a)
    std::cout<<"YES" ;
  else
    std::cout<<"NO" ;
}