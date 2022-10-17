public int fat(int n){
    int n = 4;
    int fat =1 ;

while (n > 1){
    fat = fat * n;
    n = n -1;
}
System.out.println(n + "! = " + fat);
}


//Com recursividade:
public fatorialR(int n){
    if(n>1){
        return fat(n-1) * n;
    }
    return 1;
}
