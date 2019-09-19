package siit.hw9;


public class Main {

    public static void main(String[] args) {
        //Path of the input file
        String inputPath = "E:\\SIIT\\scoala-informala-homework\\homework9\\src\\siit\\hw9\\input.txt";
        //Path of the output file
        String outputPath = "E:\\SIIT\\scoala-informala-homework\\homework9\\src\\siit\\hw9\\output.txt";
        // Target month/ Can be changed.
        int targetMonth = 12;

        App.getPersonByMonth(inputPath, targetMonth, outputPath);

    }
}