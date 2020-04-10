#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,x;
  std::cin>>r>>x ;
  int d = r+r;
  if(x>=d)
    std::cout<<"circle can be inside a square" ;
  else
    std::cout<<"circle cannot be inside a square" ;
}