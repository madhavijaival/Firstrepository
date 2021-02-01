public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        printConversion(10.5);

        printMegaBytesAndKiloBytes(2500);

        shouldWakeUp(true, -1);


    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long MilesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");
        }

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingkilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB " + "and " + remainingkilobytes + " KB");
        }
    }


    public static boolean shouldWakeUp(boolean barking, int hoursOfDay)
    {
        if (hoursOfDay < 0 || hoursOfDay > 23) {
        }
        else if (barking == true && (hoursOfDay<8 ||hoursOfDay >22)) {
        return true;
        }else {
            return false;
        }
        return false;
    }
}

