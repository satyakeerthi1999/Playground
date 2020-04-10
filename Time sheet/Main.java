#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x =0;
  int h=0,s=0;
  for(int i=0;i<7;i++)
  {
     std::cin>>x ;
     s += x*100;
    if(x>8)
      s+=(x-8)*15;
    if(i==6)
      s+=x*25;
    else if(i==0)
      s+=x*50;
    else
      h+=x;
    
  }
  if(h>40)
    s+= (h-400)*25;
  std::cout<<s ;
}