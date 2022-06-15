package chapter18;

public class MyBar implements Bar<String, Integer>{
    @Override
    public Integer get(String obj) {
        return 1;
    }
}
