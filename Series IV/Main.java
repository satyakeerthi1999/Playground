#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,t;
  std::cin>> n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      t = i*i - 1;
    }
    else
    {
      t = i*i - 2;
    }
    std::cout<<t<<" ";
  }
}