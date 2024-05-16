import java.util.PriorityQueue;

public class jadwal {

    private PriorityQueue<Tugas> Tugass;

    public jadwal() {
        Tugass = new PriorityQueue<>();
    }

    public void addTugas(Tugas Tugas) {
        Tugass.add(Tugas);
    }

    public void checkHighestPriority() {
        if (Tugass.isEmpty()) {
            System.out.println("Tidak ada jadwal yang tersisa!");
            return;
        }

        Tugas Tugas = Tugass.peek();
        System.out.printf("Task terdekat yang harus diselesaikan: %s %s", Tugas.getName(), Tugas.getSubject());
    }

    public void deleteTugas() {
        if (Tugass.isEmpty()) {
            System.out.println("Tidak ada jadwal yang tersisa!");
            return;
        }

        Tugas Tugas = Tugass.poll();

        System.out.printf("%s %s selesai dilaksanakan.", Tugas.getName(), Tugas.getSubject());
        if (!Tugass.isEmpty()) {
            System.out.printf(" berikutnya %s %s", Tugass.peek().getName(), Tugass.peek().getSubject());
        }
    }
}