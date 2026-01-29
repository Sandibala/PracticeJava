package task6;

public class Main {
        public static void main(String[] args) {
            Config config1 = Config.getInstance();
            Config config2 = Config.getInstance();
            System.out.println(config1 == config2);
            System.out.println(config1.getAppName());
        }
    }
