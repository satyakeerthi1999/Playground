#include<iostream>
int main(){
  // Type your code here
  int n;
  std::cin>>n ;
  int a[n] ;
  int e=0,o=0;
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  for(int i=0;i<n;i++)
  {
     if(a[i]%2==0)
        o+=1;
     else
       e+=1;
  }
  std::cout<<e<<"\n" ;
  std::cout<<o ;
  return 0;
}