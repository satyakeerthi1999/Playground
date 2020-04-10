#include <iostream>
using namespace std;
int main() {
    // Type your code here
    int n;
   std::cin>> n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    { 
      int k=0;
      while(k<n-1)
      {
        std::cout<<i;
        k=k+1;
      }
      std::cout<<i+1 ;
    }
    else
    {
      std::cout<<i+1;
      int k=0;
      while(k<n-1)
      {
        std::cout<<i;
        k=k+1;
      }
    }
    std::cout<<"\n" ;
  }
    return 0;
}