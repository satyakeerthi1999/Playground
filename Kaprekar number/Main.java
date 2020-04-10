#include<iostream>
#include <cmath>

using namespace std;
int iskaprekar(int n) 
{ 
    if (n == 1) 
       return true; 
  
    // Count number of digits in square 
    int sq_n = n * n; 
    int count_digits = 0; 
    while (sq_n) 
    { 
        count_digits++; 
        sq_n /= 10; 
    } 
  
    sq_n = n*n; // Recompute square as it was changed 
  
    // Split the square at different poitns and see if sum 
    // of any pair of splitted numbers is equal to n. 
    for (int r_digits=1; r_digits<count_digits; r_digits++) 
    { 
         int eq_parts = pow(10, r_digits); 
  
         // To avoid numbers like 10, 100, 1000 (These are not 
         // Karprekar numbers 
         if (eq_parts == n) 
            continue; 
  
         // Find sum of current parts and compare with n 
         int sum = sq_n/eq_parts + sq_n % eq_parts; 
         if (sum == n) 
           return 1; 
    } 
  
    // compare with original number 
    return 0; 
} 

int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
   int x = iskaprekar(n) ;
  if(x==1)
     std::cout<<"Kaprekar Number" ;
   else
       std::cout<<"Not a Kaprekar Number" ;
}