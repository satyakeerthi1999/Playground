#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a\n" ;
  std::cin>>a ;
  std::cout<<"Enter the value of n\n" ;
  std::cin>>n ;
  long x = pow(a,n);
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<x ;
  
}