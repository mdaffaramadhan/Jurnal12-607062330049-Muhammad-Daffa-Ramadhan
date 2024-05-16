public class Main {
    public static void main(String[] args) {
        jadwal Jadwal = new jadwal();

        Jadwal.addTugas(new Tugas(5, "tugas", "ISD"));
        Jadwal.addTugas(new Tugas(8, "rapat", "UKM"));
        Jadwal.addTugas(new Tugas(3, "kuis", "SBD"));

        Jadwal.checkHighestPriority();
        System.out.println();

        Jadwal.deleteTugas();
    }
}