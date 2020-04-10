#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,a;
  std::cin>>n;
  int c =0;
   for(c=0;s<n;c++)
    {
        std::cin>>a ;
        s=s+a; 
    }
  std::cout<<"The number of turns is "<<c;

}