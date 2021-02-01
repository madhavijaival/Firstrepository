public class MegaByteConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long calculateMegaByte = kiloBytes / 1024;
            long remainderKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + calculateMegaByte + " MB" + " and " + remainderKB + " KB");
        }
    }
}