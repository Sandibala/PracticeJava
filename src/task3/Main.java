package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static task3.MiniTemplateRegex.render;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        Map<String, Object> data = new HashMap<>();
        data.put("name", name);
        data.put("balance", balance);

        String template = "Hello ${name}, balance = ${balance:0.00}";
        String output = render(template, data);
        System.out.println(output);
        scanner.close();
    }
}
