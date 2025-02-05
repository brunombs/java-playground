public class Main {
    public static void main(String[] args) {
        String[] commands = {"ls", "cd", "pwd", "cp", "mv", "rm", "mkdir", "rmdir", "touch", "cat", "echo", "chmod", "chown", "find", "grep", "ps", "top", "kill", "df", "du", "tar", "zip", "unzip", "scp", "ssh", "wget", "curl", "nano", "vim", "exit"};

        for (String command : commands) {
            System.out.println(command);
        }
    }
}
