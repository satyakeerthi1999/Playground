#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,e,o;
  std::cin>>n;
  while(n!=0)
  {
    int t = n%10;
    if(t%2==0)
      e =e+t;
    else
      o = o+t;
    n=n/10;
  }  
  if(e==o)
    std::cout<<"Yes" ;
  else
    std::cout<<"No" ;
}