package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s="XCCI";
        System.out.println(convertint(s));
    }
    static int getinteger(char c){
        switch (c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
    public static int convertint(String s){
        int n=s.length();
        int result=0,current,next;
        for(int i=0; i<n; i++){
            if(i==n-1){
                result+= getinteger(s.charAt(i));
                return result;
            }
            current=getinteger(s.charAt(i));
            next=getinteger(s.charAt(i+1));
            if(current>=next){
                result+=current;
               // i++;
            }
            else{
                result+=next-current;
                i++   ;
            }
        }
        return result;
    }
}
