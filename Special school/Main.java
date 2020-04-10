#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  std::string s;
  std::string rev;
  std::string r;  
  std::cin>>s>>rev;
  int l = 0;
  for(int i=0;s[i]!='\0';i++)
      l=l+1;
  for(int i=l-1;i>=0;i--)
    r = r+s[i] ;
  
  r[l] = '\0' ;
  //std::cout<<rev<<"\n" ;
    
  if(r==rev)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong" ;
}