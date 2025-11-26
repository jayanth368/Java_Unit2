public class BufferBuilder {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" University");
        System.out.println("StringBuffer: " + sbf);

        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" Students");
        System.out.println("StringBuilder: " + sbd);
    }
}
