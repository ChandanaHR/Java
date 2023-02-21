public class wrapping
{
    public static void main(String [] args)
    {
        //Autoboxing: Conversion of primitive datatype to wrapped class object
        byte a = 1; //primitive data Type
        Byte byteobj = new Byte(a); //wrapping around byte Object
        int b = 2;
        Integer intobj = new Integer(b);
        float c = 12.3f;
        Float floatobj = new Float(c);
        double d = 250.5;
        Double doubleobj = new Double(d);
        char e = 'c';
        Character charobj = e;
        System.out.println("Values of Wrapped objects");
        System.out.println("byte byteobj:" +byteobj);
        System.out.println("integer intobj:" +intobj);
        System.out.println("float floatobj:" +floatobj);
        System.out.println("double doubleobj:" +doubleobj);
        System.out.println("Character charobj:" +charobj);
        
        //Unboxing: Conversion of wrapped class object to primitive datatype;
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
        System.out.println("Values of Unwrapped objects");
        System.out.println("byte value:" +bv);
        System.out.println("integer value:" +iv);
        System.out.println("float value:" +fv);
        System.out.println("double value:" +dv);
        System.out.println("Character value:" +cv);
    }
}
