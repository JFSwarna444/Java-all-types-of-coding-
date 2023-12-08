public class reversebit {
    public static int Bits(int n){
        int reverse=0;
        while(n>0){
            reverse=reverse<<1;
            if((n&1)==1){
                reverse=reverse^1;
            }
            n=n>>1;
        }
        return reverse;
    }
    public static void main(String[] args) {
//        int val=13,p,i;
//        int []num=new int[100];
//        int pos=0;
//        while(val>0){
//            num[pos++]=val%2;
//            val=val/2;
//        }
//        for(i=pos-1; i>=0; i--){
//            System.out.print(num[i]+" ");
//        }
//        System.out.println();
//        for( i=0; i<pos; i++) {
//            System.out.print(num[i] + " ");
//        }  p=num[i];
//            int decimalnum=0, base=1, rem;
//            while(p>0){
//                rem=p%10;
//                decimalnum=decimalnum+rem*base;
//                p=p/10;
//                base=base*2;
//            }
//            System.out.println(decimalnum);
//        }
        // p=num[i];
//        int decimalnum=0, base=1, rem;
//        while(p>0){
//            rem=p%10;
//            decimalnum=decimalnum+rem*base;
//            p=p/10;
//            base=base*2;
//        }
//        System.out.println(decimalnum);
        //   }
//}

        int n=11;
        System.out.println(Bits(n));
    }
}