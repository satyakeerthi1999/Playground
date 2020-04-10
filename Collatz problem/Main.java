#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0;
  std::cin>>n;
  int res=n;
  std::cout<<res;
  while(res!=1)
  {
     if(res%2==0)
     {  
       res = res/2;
       std::cout<<"\n"<<res ;
     }  
     else
     {
       res = 3*res + 1;
       std::cout<<"\n"<<res ;
     }  
     s = s+1;
  }
   std::cout<<"\n"<<s ;

}