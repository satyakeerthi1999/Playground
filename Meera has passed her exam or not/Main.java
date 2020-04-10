#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  
  int t,xx=0;
  std::cin>>t;
  
  for(int i=0;i<n;i++)
  {
     if(t==a[i])
     {
        xx=1;
     }
  } 
  if(xx==1)
    std::cout<<"She passed her exam" ;
  else
    std::cout<<"She failed";
}