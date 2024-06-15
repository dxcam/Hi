import java.util.Random;

public class CamilaCaicedoL10 {
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public void ccL10() {
        System.out.println();
        System.out.println("LOADING 10: ");
        Random random = new Random();
        int fileSize = 10 + random.nextInt(91); 

        String fileName = "ArchivoYarl-win_amd64.whl";
        System.out.println("Downloading " + fileName + " (" + fileSize + " kB)");

        int downloadedSize = 0;
        int barLength = 40; 

        while (downloadedSize < fileSize) {
            downloadedSize += random.nextInt(3) + 1; 
            if (downloadedSize > fileSize) {
                downloadedSize = fileSize;
            }

            double progressPercentage = (double) downloadedSize / fileSize;
            int progressBars = (int) (progressPercentage * barLength);
            int remainingBars = barLength - progressBars;

            System.out.print("\r" + GREEN + "_".repeat(progressBars) + RESET + " ".repeat(remainingBars)
                    + String.format(" %.1f / %d kB", (double) downloadedSize, fileSize));

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
