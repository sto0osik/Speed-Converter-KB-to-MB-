public class MegaBytesConverter {


    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes = 0;
        int restOfBytes = 0;

        if (kiloBytes < 0 || kiloBytes < 1024){
            System.out.println("Invalid value");
        } else {

            megaBytes = kiloBytes/1024;

            if (kiloBytes % 1024 != 0){
                restOfBytes = (1024*megaBytes - kiloBytes) * -1;
            }

            System.out.println("Kilobytes: " + kiloBytes + " KB.");
            System.out.println("MegaBytes: " + megaBytes + " MB and " + restOfBytes + " KB.");
        }
    }

}
