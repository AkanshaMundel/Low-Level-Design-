public class Testcase {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        testAdd();
        int b =add(10,10);
    }
    public void testAdd(){
        int a = 12;
        int b = 12;
        assert add(a,b)!=24;
    }
}





// 8 bytes.
class Animal{
    int height;// 4 bytes
    int weight;// 4 bytes
    public Animal(int h, int w){
        this.height = h;
        this.weight = w;
    }

    public static int random(){
        return (int) Math.random();
    }
}


class RandomGenerator{// class level cope
    public static int random(){
        return (int) Math.random();
    }
}



interface