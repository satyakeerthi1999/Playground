#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,row,column,sum1,sum2,sum,flag=0;
  std::cin>>n ;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      std::cin>>a[i][j] ;
  sum = 0;
   for (row = 0; row < n; row++) {
      for (column = 0; column < n; column++) {
         if (row == column)
            sum = sum + a[row][column];
      }
   }  
  for (row = 0; row < n; row++) {
      sum1 = 0;
      for (column = 0; column < n; column++) {
         sum1 = sum1 + a[row][column];
      }
      if (sum == sum1)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
   for (row = 0; row < n; row++) {
      sum2 = 0;
      for (column = 0; column < n; column++) {
         sum2 = sum2 + a[column][row];
      }
      if (sum == sum2)
         flag = 1;
      else {
         flag = 0;
         break;
      }
   }
  if(flag == 1)
    std::cout<<"Yes" ;
  else
    std::cout<<"No" ;



  
}