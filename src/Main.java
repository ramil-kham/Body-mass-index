public class Main {
    public static void main(String[] args) {
        int weight = 65;
        double height = 174;
        double index = weight / (height * height / 10_000);
        System.out.println(index);
    }
}
