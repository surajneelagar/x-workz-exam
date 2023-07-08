class Opr {
    public static void main(String[] args) {
        byte a,b;
        a=10;
        b=20;
        b=assign(a);
        System.out.println(a+ " ," + b);
     }

    private static byte assign(byte a) {

    a+=100;
        return a;
    }
}


// OutPut

// 10 , 110