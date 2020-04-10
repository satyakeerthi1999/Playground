#include<iostream>
int main()
{
  // Type your code here
  int n,t = 0;
  std::cin>>n ;
  do{
    t=t+1;
    n = n/10;
  }while(n!=0);
    
  std::cout<<t ;
}