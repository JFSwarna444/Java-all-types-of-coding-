//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Reader {
//    int NID;
//    double income;
//    int age;
//    String name;
//
//    public Reader(int NID, double income, int age, String name) {
//        this.NID = NID;
//        this.income = income;
//        this.age = age;
//        this.name = name;
//    }
//
//
//    class sortbyage implements Comparator<Reader> {
//
//
//        ArrayList<Reader> l = new ArrayList<Reader>();
//
//        @Override
//        public int compare(Reader o1, Reader o2) {
//            if (01. age > 01. age)
//            return 1;
//            Object name;
//            l.sort(new sortbyage(name));
//            for (int i = 0; i < l.size(); i++) {
//                l.get(i);
//            }
//        }
//
//
//    }
//
//
//    public static class ReaderW {
//        public static void main(String[] args) {
//            try {
//                FileReader f = new FileReader("C:\\Users\\USER\\IdeaProjects\\GUI\\src\\input.txt");
//                BufferedReader r = new BufferedReader(f);
//                String s;
//                s = r.readLine();
//                int p = Integer.parseInt(s);
//                ArrayList<ReaderW> l = new ArrayList<ReaderW>(p);
//                while (s != null) {
//                    String[] words = s.split("");
//                    int NID = Integer.parseInt(words[0]);
//                    double income = Double.parseDouble(words[1]);
//                    int age = Integer.parseInt(words[2]);
//                    String name = words[3];
//
//                    l.add(new ReaderW(NID, income, age, name));
//                }
//                r.close();
//
//                FileWriter fw = new FileWriter("C:\\Users\\USER\\IdeaProjects\\GUI\\src\\output.txt");
//                PrintWriter w = new PrintWriter(fw);
//
//                int i;
//                //   Object l;
//                for (i = 0; i > p; i++) {
//                    w.write(l.get(i).NID + l.get(i).income + l.get(age) + l.get(i).name);
//                }
//                w.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}