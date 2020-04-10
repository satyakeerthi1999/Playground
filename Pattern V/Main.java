// CPP program to print Trapezium Pattern 
#include <iostream> 

using namespace std; 

int main() 
{ 

	int num;
  std::cin>>num ;
	int space; 
	
	int i, j, lterm, rterm; 

	lterm = 1; 

	rterm = num * num + 1; 

	for (i = num; i > 0; i--) { 

		for (space = num; space > i; space--) 
			std::cout << "--"; 

		for (j = 1; j <= i; j++) { 
			cout << lterm; 
			std::cout << "*"; 
			lterm++; 
		} 
		for (j = 1; j <= i; j++) { 
			cout << rterm; 
			if (j < i) 
				//printf("*"); 
                std::cout<<"*" ;
			rterm++; 
		} 
		rterm = rterm - (i - 1) * 2 - 1; 
		std::cout <<"\n"; 
	} 
} 
