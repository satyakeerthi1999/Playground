#include<iostream>
int main()
{
  int n,x=1;
  std::cin>>n;
  float a = 0.5;
  std::cout<<a<<" " ;
  while(n-1 > 0)
  {
    a = a+x ;
    std::cout<<a<<" " ;
        x = x*3;

    n = n-1;
  }
}
