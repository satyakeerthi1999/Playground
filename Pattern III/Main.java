#include <iostream>
#include<iostream>
int main()
{
   int n,t=1;
   std::cin>>n;
      int i=1;
   while(i<=n)
   {
     int x = 0;
     while(x<i)
     {
       if(x==i-1)
       std::cout<<t ;
       else
       std::cout<<t<<"*" ;
       x=x+1;
     }
     t=t+1;
     std::cout<<"\n" ;
     i = i+1;
   }
   i = n;
   t = t-1;

      while(i>0)
   {
     int x = 0;
     while(x<i)
     {
       if(x==i-1)
       std::cout<<t ;
       else
      std::cout<<t<<"*" ;
       x=x+1;
     }
     t=t-1;
     std::cout<<"\n" ;
     i = i-1;
   }
}
