public class ClassTestDemo {

    public void test(Class<?> clazz) {
        System.out.println(clazz.getName());
    }

    public static void main(String[] args) {
        new ClassTestDemo().test(String.class);
    }

}
