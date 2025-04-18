package core.java.programs.Datastructures;

import java.util.Stack;

public class TrayService {
    public String getNextTray(Stack<String> stack) {
        if (stack.isEmpty()) {
            return "No trays available";
        }
        return stack.peek();
    }
    public String removeTray(Stack<String> stack) {
        if (stack.isEmpty()) {
            return "No trays available to remove";
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Tray 1");
        stack.push("Tray 2");
        stack.push("Tray 3");

        TrayService trayService = new TrayService();
        String removedTray = trayService.removeTray(stack);
        System.out.println("Removed tray: " + removedTray);

        String nextTray = trayService.getNextTray(stack);
        System.out.println("The next tray to be served is: " + nextTray);


        // The stack remains unchanged
        System.out.println("Stack after peek: " + stack);
    }
}