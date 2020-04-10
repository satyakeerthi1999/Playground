#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int balls,runs,truns,tballs;
  std::cin>>balls>>runs>>truns>>tballs ;
  int overs = balls/6;
  std::cout<<overs ;
  int fin = tballs/6;
  int f = tballs%6;
  float x = fin+(f*0.1f) ;
  std::cout<<"\n"<<x ;
  float cur = truns/x ;
  
  //std::cout<<"\n"<<cur ;
      printf("\n%.1f", cur);  

  float tot = runs/(overs*1.0f) ;
  //std::cout<<"\n"<<tot ;	
      printf("\n%.1f", tot);  

  
  if(cur >= tot)
    std::cout<<"\nEligible to Win" ;
  else
    std::cout<<"\nNot Eligible to Win" ;
}