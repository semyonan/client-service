package entities;

import java.util.Scanner;

public class CLIclient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String str = in.nextLine();
            if ("quit".equalsIgnoreCase(str)) {
                break;
            } else {
                var arguments = str.split(" ");
                if (arguments.length <= 1) {
                    System.out.println("Please add arguments. For example ... get test-key.");
                } else if (arguments[0].equals("set") && arguments[0].equals("get") )  {
                    System.out.println("First argument must be get/set.");
                } else if (arguments[0].equals("set") && arguments.length == 1) {
                    System.out.println("Set have two arguments: key and value.");
                } else {
                    if (arguments[0].equals("set")) {
                        try {
                            Client.Set(arguments[1], arguments[2]);
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    } else {
                        try {
                            System.out.println(Client.Get(arguments[1]));
                        } catch (Exception e) {
                            System.out.println(e.toString());
                        }
                    }
                }
            }
        }
        in.close();
	}
}
