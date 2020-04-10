#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,x=11;
  std::cin>>n;
  while(n>0)
  {
    std::cout<<x*x<<" ";
    x =x+4;
    n=n-1;
  }
}