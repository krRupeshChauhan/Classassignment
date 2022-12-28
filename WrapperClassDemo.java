public class WrapperClassDemo {
    public  static void main(String []args){
        //convert int to Integer-autoboxing
        int a=30;
        //explicity convertion
        Integer in=Integer.valueOf(a);
        System.out.println(in);
        //autoboxing convert automatically
        Integer i=a;
        System.out.println(i);
        float f=50;
        Float f1=Float.valueOf(f);

        Float flt=f;
        System.out.println(f1+" "+flt);

        short s=90;
        //short ss=new Short(s);
       // System.out.println(ss);
        //unboxing object to primitive
        Integer r=45;
       //convert explicit Integer to int
        int b=r.intValue();
        System.out.println(b);
        //unboxing automatically conversion done
        int c=r;
        System.out.println(c);
        byte bt=23;
        Byte bb=bt;

    }
}
