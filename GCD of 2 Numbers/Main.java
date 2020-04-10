#include<iostream>
int gcd(int a,int b)
{
   if(a==b)
     return a;
   else if(a>b)
     gcd(a-b,b);
   else if(a<b)
     gcd(a,b-a);
}
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b ;
  int x = gcd(a,b) ;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<x ;
}