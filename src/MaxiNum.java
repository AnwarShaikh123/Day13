public class MaxiNum {
        public void compare(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a);
        } else if (b>a && b>0) {
            System.out.println(b);
        }else
        System.out.println(c);
    }

    public static void main(String[] args) {
        MaxiNum cd=new MaxiNum();
        cd.compare(2,3,7);

    }

}
