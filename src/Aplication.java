public class Aplication {
    public static void main(String[] args) {
        Map<Integer, String> map = new Map<>();
        map.addMyEntry(new MyEntry<>(1, "Petro"));
        map.addMyEntry(new MyEntry<>(2, "Getro"));
        map.addMyEntry(new MyEntry<>(3, "Setro"));
        map.addMyEntry(new MyEntry<>(4, "Tetro"));

        map.deleteMyEntry(2);
        map.deleteMyEntryByV("Setro");
        map.setKeys();
        map.listValues();
        map.showMap();


        System.out.println(map);


    }
}
