/*
Revision-4
*/
class ShiftDemo {
    public static void main(String args[]) {
        int a = 10;
        String binary = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); // Convert to 8-bit binary
        System.out.println("Binary representation of " + a + " is: " + binary);
    }
}
