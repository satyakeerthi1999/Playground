#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n ;
  int x = n,sum=0;
  while(n!=0)
  {
     int t = n%10;
      sum = sum+t;
     n = n/10;
  }  
  if(x%sum == 0)
    std::cout<<"Harshad Number" ;
  else
    std::cout<<"Not Harshad Number" ;
}