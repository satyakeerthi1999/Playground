#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,res;
  std::cin>>a>>b ;
  if(b<a)
  {
    a=100-a;
    res=a+b;
    std::cout<<res;
  }
  else
  {
    std::cout<<b-a ;
  }
 
}