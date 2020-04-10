#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 

int main()
{
  //Type your code here.
  int a,b,c;
  std::cin>>a>>b>>c ;
  int t1= gcd(a,b);
  int t2 = gcd(t1,c);
      if(a >= b && a >= c)
    {
        if(b >= c)
        {
          std::cout<<"The treasure is in box which has number "<<b;
        }
        else
        {
          std::cout<<"The treasure is in box which has number "<<c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
          std::cout<<"The treasure is in box which has number "<<a;
        }
        else
        {
          std::cout<<"The treasure is in box which has number "<<c;
        }
    }
    else
    {
      if(a>=b)
          std::cout<<"The treasure is in box which has number "<<a;
      else
         std::cout<<"The treasure is in box which has number "<<b;

    }
  
  
  
  std::cout<<"\nThe code to open the box is "<<t2 ;
  
}