public class this_keyword {
    public static void main(String[] args) {
        // This Keyword is basically used to refer to the current object there are many
        // way we can use this keyword
        System.out.println("helo");
        e1 example1 = new e1();
        example1.setName("this is name ");
        example1.getName();

        e2 example2 = new e2("hello this is second example");
        System.out.println(example2);
        e3 Example3 = new e3();
        Example3.test();

        e4 Example4 = new e4().name("Altamash");
        System.out.println(Example4);
        

    }
}

    // 1) Refer to the current object
    class e1 {
        private String name = "";

        public void setName(String name) {
            this.name = name;
        }

        public void getName() {
            System.out.println(name);
        }
    }
    
    // 2) Invoke another constructor
    class e2 {
        String name = "";

        e2(String name) {
            this(0);
        }

        e2( int age) {
            System.out.println(age);
        }
    }

    //Pass the current instance as a parameter 
    class e3 {
        void print(e3 obj) {
            System.out.println(obj);
        }

        void test() {
            print(this);
        }
    }

    //4) Return the Current Instance 
    class e4 {
        String name = "";

        e4 name(String name) {
            this.name = name;
            return this;
        }
    }

