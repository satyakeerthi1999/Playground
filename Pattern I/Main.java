#include <iostream>
#include<iostream>
int main()
{
   int n;
   std::cin>>n;
      int i=1;
   while(i<=4)
   {
     int x = 0;
     while(x<i)
     {
       std::cout<<n ;
       x=x+1;
     }
     n=n+1;
     std::cout<<"\n" ;
     i = i+1;
   }
   i = 4;
   n = n-1;

      while(i>0)
   {
     int x = 0;
     while(x<i)
     {
       std::cout<<n ;
       x=x+1;
     }
     n=n-1;
     std::cout<<"\n" ;
     i = i-1;
   }
}
