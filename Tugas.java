public class Tugas implements Comparable {
    private String name;
    private int priority;
    private String subject;

    public Tugas(int priority, String name, String subject) {
        this.name = name;
        this.priority = priority;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public int compareTo(Object o) {
        Tugas s = (Tugas) o;
        if (this.priority > s.priority) {
            return 1;
        } else if (this.priority < s.priority) {
            return -1;
        } else {
            return 0;
        }
    }
}