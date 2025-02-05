import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> commands = new HashMap<>();
        commands.put("ls", "Lists directory contents");
        commands.put("cd", "Changes the current directory");
        commands.put("pwd", "Prints the current working directory");
        commands.put("cp", "Copies files and directories");
        commands.put("mv", "Moves or renames files and directories");
        commands.put("rm", "Removes files or directories");
        commands.put("mkdir", "Creates a new directory");
        commands.put("rmdir", "Removes an empty directory");
        commands.put("touch", "Creates an empty file or updates timestamp");
        commands.put("cat", "Displays the contents of a file");
        commands.put("echo", "Prints a message or writes to a file");
        commands.put("chmod", "Changes file permissions");
        commands.put("chown", "Changes file ownership");
        commands.put("find", "Searches for files and directories");
        commands.put("grep", "Searches for patterns within files");
        commands.put("ps", "Displays currently running processes");
        commands.put("top", "Shows real-time system processes");
        commands.put("kill", "Terminates a process");
        commands.put("df", "Displays disk space usage");
        commands.put("du", "Shows directory size usage");
        commands.put("tar", "Archives files");
        commands.put("zip", "Compresses files into a zip archive");
        commands.put("unzip", "Extracts files from a zip archive");
        commands.put("scp", "Securely copies files between systems");
        commands.put("ssh", "Connects to a remote system securely");
        commands.put("wget", "Downloads files from the web");
        commands.put("curl", "Transfers data from or to a server");
        commands.put("nano", "Opens the Nano text editor");
        commands.put("vim", "Opens the Vim text editor");
        commands.put("exit", "Closes the terminal session");

        for (Map.Entry<String, String> entry : commands.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}