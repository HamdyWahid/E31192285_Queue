package programantrianbank;

/**
 *
 * @author HANIF PRANATA
 */
public class linked {

    bank head, tail;

    public linked() {
        head = null;
        tail = null;
    }

    public void enque() {
        bank baru = new bank();
        baru.input();
        if (head == null) {
            head = baru;
        } else {
            tail.next = baru;
        }
        tail = baru;
    }

    public void deque() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("Keluar Data Dengan Id : " + head.id);
            head = head.next;
        }
    }

    public void view() {
        if (head == null) {
            System.out.println("- Kosong -");
        } else {
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for (bank a = head; a != null; a = a.next) {
                a.read();
            }
        }
    }
}
