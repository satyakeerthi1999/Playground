#include<iostream>
int main(){
  // Type your code here
  int n;
  std::cin>> n;
  int fact = 1;
  for(int i=1;i<=n;i++)
    fact = fact*i;
  std::cout<<fact;
}