package com.company;

import java.util.*;

public class VectorR4{

    private  int i;
    private  int i1;
    private  int i2;
    private  int i3;

    //static ArrayList<VectorR4> vectorList;
    public VectorR4(int i, int i1, int i2, int i3) {
        this.i =i;
        this.i1=i1;
        this.i2=i2;
        this.i3=i3;


    }
    ArrayList<VectorR4> vectorList= new ArrayList<VectorR4>();
    // vectorList = new ArrayList<>();

        vectorList.add(new VectorR4(1,2,3,4));
        vectorList.add(new VectorR4(-1,-2,-3,-4));
        vectorList.add(new VectorR4(101,-202,303,-404));
        vectorList.add(new VectorR4(0,2,0,4));

    // 1. iterate through Iterator -2
    // use an iterator to iterate through the phone vector. The iterator should be a static method

    Iterator<VectorR4> itr = vectorList.iterator();

        while (itr.hasNext()) {
        System.out.print(itr.next() + " ");
    }
        System.out.println();

    public int main(String[] args) {


        // for printing you have to override the ToString method of the VectorR4 class

        int i;
        int i1;
        int i2;
        int i3;
//         int i;
//         String name;
//
//        VectorR4(int i, int i1, int i2, int i3) {
//            this.id = id;
//            this.name = name;
//        }
//

//         VectorR4( int i1, int i2, int i3) {
//            this.i =i;
//            this.i1=i1;
//            this.i2=i2;
//            this.i3=i3;
//
//
//        }
        public int geti() {
            return i;
        }
        public int geti1() {
            return i1;
        }
        public int geti2() {
            return i2;
        }
        public int geti3() {
            return i3;
        }
////
//        public String getName() {
//            return name;
//        }

        @Override
        public String toString() {
            return this.i + ", " + this.i1," ,"+this.i2, " ,"+ this.i3;
        }
    }

    // 2. sort by norm with comparator and print the values - 3
    public static void printList(List<vectorList> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getId() + ", " + al.get(i).getName());
        }
        System.out.println();
    }


        // 3. sort by 4th dimension of the vector ( z coordinate) with Comparable - 2

        // 4. hashmap  - 2
        // create a Hashmap with VectorR4 objects as KEY and String as value
        // In order to use VectorR4 as KEY you have to override hashcode method in the VectorR4 class
        HashMap<VectorR4, String> passWords = new HashMap<>(10);
//        passWords.put(vectorList.get(0), "Homer Simpson");
//        passWords.put(vectorList.get(1), "Peter Griffin");
//        passWords.put(vectorList.get(2), "Sheldon Cooper");
//        passWords.put(vectorList.get(3), "Rachel");

        // concatenate 1991 to the fourth value of the hashmap - 1

    }
}