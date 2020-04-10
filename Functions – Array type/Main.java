#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array\n" ;
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n" ;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  int o=0,e=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e =1;
    else
      o=1;
  }
  if(e==1 && o==1)
    std::cout<<"The array is Mixed";
  else if(e==1)
    std::cout<<"The array is Even";
  else
    std::cout<<"The array is Odd" ;
  
}