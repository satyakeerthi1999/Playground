#include <iostream>
#include<iostream>
int main()
{
   int n,x=5,t=6;
  std::cin>>n;
  while(n>0)
  {
    std::cout<<t<<" " ;
    t = t+x;
    x = x+5;
    n=n-1;
  }
}
