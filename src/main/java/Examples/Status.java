package Examples;

public enum Status {
    PAUSE(0),
    START(1),
    STOP(2);

    private final int value;

    private Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int StatusLength(){
        return Status.values().length;
    }

    public static void main(String[] args) {
        System.out.println(START.value + 1);
        System.out.println();
        System.out.println(START.value);
        System.out.println(START.getValue());
        System.out.println(StatusLength());
    }
}