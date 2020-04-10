#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,dt,ct;
  std::cin>>d1>>c1>>d2>>c2 ;
  
  dt = d1+d2 ;
  ct = c1+c2 ;
  while(ct>=100)
  {
     dt = dt+1;
     ct = ct-100 ;
  }
  std::cout<<dt;
  std::cout<<"\n"<<ct ;
}