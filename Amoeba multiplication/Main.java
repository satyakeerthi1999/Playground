#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a=0,b=1,c ;
  std::cin>>n ;
  if(n==1)
    std::cout<<a;
  else if(n==2)
    std::cout<<b;
  else
  {
      while(2<n)
      {
         c = a+b;
         a = b;
         b = c;
         n = n-1 ;
      }
    std::cout<<b ;
  }
}