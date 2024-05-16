import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner InputNama = new Scanner(System.in);

        int i = 1;
        while (true) {
            System.out.print("Masukkan nama mahasiswa ke-" + i + ": ");
            String input = InputNama.nextLine();

            if (input.trim().isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                } catch (IllegalArgumentException a) {
                    System.out.println(a.getMessage());
                    continue;
                }
            }

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            namaMahasiswa.add(input);
            i++;
        }

        System.out.println("Daftar nama mahasiswa yang diinputkan:");
        for (String name : namaMahasiswa) {
            System.out.println("- " + name);
        }
    }
}