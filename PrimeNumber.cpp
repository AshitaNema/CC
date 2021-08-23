#include <iostream>
#include <math.h>
using namespace std;
//WAP to find whether the number is prime or not in linear optimality.
int main() {
    
    long long num = 1331, iter;
    
    if(num == 1) cout<<"Niether Prime nor Composite.";
    else if(num == 2) cout<<"Prime.";
    else if(num%2 == 0) cout<<"Composite.";
    else {
        for(iter=3; iter<=sqrt(num); iter+=2) {
            if(num%iter==0) break;
        }
        if(iter > sqrt(num)) cout<<"Prime.";
        else cout<<"Composite.";
    }

    return 0;
}
