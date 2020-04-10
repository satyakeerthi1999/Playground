#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c ;
  int a[r][c] ;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>a[i][j] ;
  
  int m = 0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(m < a[i][j])
        m = a[i][j] ;
    }
  }
  
  std::cout<<"The maximum element is "<<m;
}