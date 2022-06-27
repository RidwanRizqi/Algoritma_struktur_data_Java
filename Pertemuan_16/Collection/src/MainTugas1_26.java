import java.util.Scanner;
import java.util.Stack;

public class MainTugas1_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        Stack<Film_26> film26Stack = new Stack<>();
        // tambahan data untuk keperluan test
        film26Stack.push(new Film_26(1, "Spider-Man: No Way Home", 2021,"Jon Watts"));
        film26Stack.push(new Film_26(2, "Dr. Strange: The Madness of Multiverse",2022,"Sam Raimi"));
        film26Stack.push(new Film_26(3, "Skyfall",2012,"Sam Mendes"));
        film26Stack.push(new Film_26(4, "Aquaan",2018,"James Wan"));
        film26Stack.push(new Film_26(5, "Dark Knight Rises",2012,"Christopher Nolan"));
        do {
            System.out.println("====================================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("====================================");
            System.out.println();
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info Semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih: ");
            menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    int id_film, tahun;
                    String judul_film, director;
                    System.out.print("ID Film\t\t : ");
                    id_film = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul Film\t : ");
                    judul_film = input.nextLine();
                    System.out.print("Tahun Tayang : ");
                    tahun = input.nextInt();
                    input.nextLine();
                    System.out.print("Director\t : ");
                    director = input.nextLine();
                    Film_26 newData = new Film_26(id_film, judul_film, tahun, director);
                    film26Stack.push(newData);
                }
                case 2 -> {
                    Film_26 pop = film26Stack.pop();
                    System.out.printf("Film{ID Film=%d, Judul Film=%s, Tahun Tayang=%d, Director:%s\n",
                            pop.idFilm, pop.judulFilm, pop.tahun, pop.director);
                }
                case 3 -> {
                    Film_26 peek = film26Stack.peek();
                    System.out.printf("Film{ID Film=%d, Judul Film=%s, Tahun Tayang=%d, Director:%s\n",
                            peek.idFilm, peek.judulFilm, peek.tahun, peek.director);
                }
                case 4 -> film26Stack.forEach(film_26 -> {
                    System.out.printf("Film{ID Film=%d, Judul Film=%s, Tahun Tayang=%d, Director:%s\n",
                            film_26.idFilm, film_26.judulFilm, film_26.tahun, film_26.director);
                });
                case 5 -> System.exit(0);
            }
        } while (menu <= 5 && menu >= 1);
    }
}
