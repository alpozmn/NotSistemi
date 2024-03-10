public class Main {
    public static void main(String[] args) {
        Course fizik = new Course("Fizik", "PHY101", "FZK", 90, 60, 20, 80);
        double fizikOrtalama = fizik.calculateOverallGrade();
        System.out.println("Fizik Ortalaması: " + fizikOrtalama);

        Course matematik = new Course("Matematik", "MAT101", "MAT", 85, 75, 30, 70);
        double matematikOrtalama = matematik.calculateOverallGrade();
        System.out.println("Matematik Ortalaması: " + matematikOrtalama);
    }
}
