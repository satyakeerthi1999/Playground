#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float h,r;
  std::cin>>a>>h ;
  if(a>3)
    std::cout<<"Number of items is more" ;
  else
  {
     if(a==2)
     {
        r = (h*50)/100 + h ;
       std::cout<<r ;
     } 
    else
    {
      r = h*2;
      std::cout<<r;
    }
    
  }  
}