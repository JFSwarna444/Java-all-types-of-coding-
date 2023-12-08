public abstract class Animal {
    int age;
    double height;
    double weight;

    public Animal(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
///For using Private ,must use get set method then press( alt + insert) then shift up and down
    ///intellij will auto generate get set method for Animal class

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //    public Animal(int age, double height, double weight){
//        this.age=age;
//        this.height=height;
//        this.weight=weight;
//    }
    public abstract void eat();

    public abstract void makesound();

    static class bird extends Animal {
        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public bird(int age, double height, double weight, String color) {
            super(age, height, weight);
            this.color = color;
        }


        @Override
        public void eat() {
            System.out.println("eating");
        }

        @Override
        public void makesound() {
            System.out.println("sound");
        }
    }

    static class Lion extends Animal {
        private String name;

        public String getColor() {
            return name;
        }

        public void setColor(String color) {
            this.name = name;
        }

        public Lion(int age, double height, double weight, String color, String name) {
            super(age, height, weight);
            this.name = name;
        }

        public void eat() {
            System.out.println(name + "eating meat");
        }

        @Override
        public void makesound() {
            System.out.println(name + "roaring");
        }
    }
}
    class Main {
        public static void main(String[] args) {
            Animal.Lion bobo= new Animal.Lion(6,4.5,18.7,"yellow","bobo");
            bobo.eat();
            bobo.makesound();

            Animal.bird rio = new Animal.bird(2,2.3,1.2,"green");
            rio.eat();
            rio.makesound();

            //sunclass polymorphosim (parent class refererense child class(using array))
            Animal [] animals=new Animal[2];
            animals[0]=bobo;
            animals[1]=rio;

            for(Animal animal:animals){
                animal.makesound();

            }

            for(Animal animal:animals){
                animal.eat();
            }
        }


    }

