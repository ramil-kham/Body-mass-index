public class Main {
    public static void main(String[] args) {
        int weight = 65;
        int height = 174;
        int index = weight / (height * height / 10_000);
        System.out.println(index);
    }
}
