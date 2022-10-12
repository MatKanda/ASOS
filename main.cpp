/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
   int a = 0;

   LOOP:do {
      if( a%2==0 && a < 20) {
         a = a + 1;
         cout << "value of a: " << a << endl;
         goto LOOP2;
      }
   } 
   while( a < 20 );
   
    LOOP2:do{
      if( a%2==1  && a < 20) {
         a = a + 1;
         cout << "value of a: " << a << endl;
         goto LOOP;
      }
      
   } 
   
    do{
         a = a + 1;
         cout << "value of a: " << a << endl;
   } 
   while( a < 20 ); 
   return 0;
}

