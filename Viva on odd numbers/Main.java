#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  float tot = 0.0f ;
  while(1)
  {
     std::cin>>n;
     if(n<0)
     { 
       tot = tot-1;
       break;
     }  
     else if(n>0 &&  n%2==0)
     {
       tot = tot-0.5;
     }
    else if(n>0 && n%2!=0)
    {
      tot = tot+1;
      c=c+1;
      if(c==3)
        break;
    }
  }
  std::cout<<tot ;
}