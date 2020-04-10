#include<iostream>
int main()
{
  //Type your code here.
  int n;
  std::cin>> n;
  int a=0,b=1,c ;
  int x = n;
  while(2<n)
  {
     c = a+b;
     a = b;
     b = c;
     n = n-1;
  }
  std::cout<<"The term "<<x<<" in the fibonacci series is "<<b;
}