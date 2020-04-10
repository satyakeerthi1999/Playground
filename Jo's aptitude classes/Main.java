#include <iostream>
int gcd(int a,int b)
{
   if(a==b)
     return b;
   else if(a>b)
     return gcd(a-b,b); 
   else if(b>a)
     return gcd(a,b-a);
} 
int main()
{
    int a,b,c,d;
    std::cin>>a>>b>>c>>d ;
    int x = gcd(a,b);
     int y = gcd(x,c);
    if(y==d)
      std::cout<<"Answer is correct.";
    else
      std::cout<<"Answer is wrong." ;
}      
