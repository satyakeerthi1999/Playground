#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  int m =0,s=0,k;
  std::cin>>r>>c;
  int a[r][c] ;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>a[i][j];
     
  std::cout<<"Sum of rows is " ;

  for(int i=0;i<r;i++)
  {
    s = 0;
    for(int j=0;j<c;j++)
    {
       s=s+a[i][j];
    }  
    std::cout<<s<<" ";
    if(m < s)
    {  
      m = s;    
      k = i;
    }  
  }
  std::cout<<"\nRow "<<k+1<<" has maximum sum\n" ;
  m =0 ;
  std::cout<<"Sum of columns is ";
  for(int i=0;i<c;i++)
  {
    s = 0;
    for(int j=0;j<r;j++)
    {
       s=s+a[j][i];
    }  
    std::cout<<s<<" ";
    if(m < s)
    {  
      m = s;    
      k = i;
    }  
  }
  std::cout<<"\nColumn "<<k+1<<" has maximum sum\n" ;   
}