#include<iostream>
int main(){
  
  int n,c=0;
  std::cin>>n ;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      c = c+1  ;
    if(c>2)
      break;
  }
  if(c==2)
    std::cout<<"Eligible" ;
  else
    std::cout<<"Not eligible" ;
}
