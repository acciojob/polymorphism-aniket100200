package com.driver;

import com.sun.nio.sctp.SctpSocketOption;

public class Main
{
    static class Product{
        public Product(){}
        public int product(int x,int y)
        {
            return x*y;
        }
        public  int product(int x,int y,int z){
            return x*y*z;
        }
    }

    public static void main(String[]args)
    {
        Product p=new Product();
       System.out.println( p.product(10,20));
    }
}