#include<iostream>
int main()
{
  //Type your code here.
  int n;
  long fact = 1;
  std::cin>>n;
  int t = n;
  while(n!=0)
  {
     fact = fact*n;
     n = n-1;
  }
  std::cout<<"The factorial of "<<t<<" is "<<fact;
}