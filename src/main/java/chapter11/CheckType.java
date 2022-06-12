package chapter11;

public class CheckType {
    public static void main(String[] args) {
        Member member = new Member();
        if (member instanceof Member) {
            System.out.println("Member型");
        }
        if (member instanceof Version) {
            System.out.println("Version型");
        }
    }
}
