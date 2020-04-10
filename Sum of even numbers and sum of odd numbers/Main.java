#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n],odd=0,even=0;
  for(int i=0;i<n;i++)
    std::cin>>a[i] ;
  
  for(int i=0;i<n;i++)
  {
     if(a[i]%2==0)
       even+=a[i] ;
     else
       odd+=a[i] ;
  }
  std::cout<<"The sum of the even numbers in the array is "<<even;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<odd ;
}