#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  std::string s;
  getline(std::cin,s);
  int v=0,c=0,w=0,d=0,si=0,al = 0;
  for(int i=0;s[i]!='\0';i++)
  {
     if(s[i] ==' ')
       w=w+1 ;
     else if('0'<=s[i] && s[i]<='9')
       d = d+1;
     else if((65<=s[i] && s[i]<=90) || (97<=s[i] && s[i]<=122))
       al = al+1 ;
     else
       si = si+1;
  }
  for(int i=0;s[i]!='\0';i++)
  {
     if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
         v = v+1;
  }
  c = al-v;
  std::cout<<"Vowels:"<<v;
  std::cout<<"\nConsonants:"<<c;
  std::cout<<"\nWhite Spaces:"<<w;
  std::cout<<"\nDigits:"<<d;
  std::cout<<"\nSymbols:"<<si;
  
}