//
//  main.cpp
//  HWProof.cpp
//
//  Created by Pradyuman Dixit on 26/09/18.
//  Copyright © 2018 Pradyuman Dixit. All rights reserved.
//

// This is the code I made for Reasoning and Logic Home work assignment...

#include <iostream>
#include <math.h>
using namespace std;

int getDivisors(int n){
    int count=2;
    
    for(int i=2;i<sqrt(n);i++){
        if(n/i==0)
            count++;
    }
    
    return count;
}

int main() {
    int n,c=0,p=0;
    cin>>n;
    
    for(int i=1;i<=n;i++){
        if(sqrt(i)<getDivisors(i))
            c++;
    }
    
    for(int i=1;i<n;i++){
        if(getDivisors(i)==2)
            p++;
    }
    
    if(c>p)
        cout<<"True\n";
    else
        cout<<"False\n";
    
    
    return 0;
}
