package siit.hw9;


public class Main {

    public static void main(String[] args) {

        String inputPath = "E:\\SIIT\\scoala-informala-homework\\homework9\\src\\siit\\hw9\\input.txt";
        String outputPath = "E:\\SIIT\\scoala-informala-homework\\homework9\\src\\siit\\hw9\\output.txt";
        int targetMonth = 12;

        App.getPersonByMonth(inputPath, targetMonth, outputPath);

    }
}