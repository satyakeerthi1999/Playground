#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n] ;
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  int max = 0;
  for (int i=0;i<n;i++)
  {
     if(a[i] > max)
       max = a[i] ;
  }
  std::cout<<max;
}