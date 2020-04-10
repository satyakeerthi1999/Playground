#include <iostream>
#include<iostream>
int main()
{
   int n,x=11,t;
  std::cin>>n;
  while(n>0)
  {
     t = x*x ;
    std::cout<<t<<" " ;
    x = x+4;
    n = n-1;
  }
}  
