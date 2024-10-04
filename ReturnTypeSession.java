public class ReturnTypeSession {
	public static void main(String[] args) {
		byte get_ByteValue = getByteValue();
        System.out.println("Returned value of Byte: "+get_ByteValue);

        short get_ShortValue = getShortValue();
        System.out.println("Returned value of Short: "+get_ShortValue);

        int get_IntValue = getIntegerValue();
        System.out.println("Returned value for Integer: "+get_IntValue);

        float get_FloatValue = getFloatValue();
        System.out.println("Value of Pie: "+get_FloatValue);

        double get_DoubleValue = getDoubleValue();
        System.out.println("Returned value for Double: "+get_DoubleValue);

        boolean get_BooleanValue = getBooleanValue();
        System.out.println("True or False: "+get_BooleanValue);

        char get_CharValue = getCharValue();
        System.out.println("Char Value: "+get_CharValue);
	}

	public static byte getByteValue() {
        byte byteValue = 127;
        return byteValue;
    }

    public static short getShortValue() {
        short shortValue = 32766;
        return shortValue;
    }

    public static int getIntegerValue() {
        int intValue = 2147483647;
        return intValue;
    }

    public static long getLongValue() {
        long longValue = 9223372036854775807l;
        return longValue;
    }

    public static float getFloatValue() {
        float floatValue = 3.14f;
        return floatValue;
    }

    public static double getDoubleValue() {
        float doubleValue = 545.14343f;
        return doubleValue;
    }

    public static boolean getBooleanValue() {
        int value = 0;
        if(value == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static char getCharValue() {
        char charValue = 'A';
        return charValue;
    }
}