package util;


import java.io.*;
import java.time.LocalDateTime;
import java.util.Properties;

public class ErrorLogger {

    private static String logPath;
    private static String logLevel;
    private static boolean logEnabled;

    static {
        loadProperties();
    }

    private static void loadProperties() {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("./resources/logError.properties")) {
            props.load(input);
            logPath = props.getProperty("log.file.path", "logs/errorLog.txt");
            logLevel = props.getProperty("log.level", "ERROR");
            logEnabled = Boolean.parseBoolean(props.getProperty("log.enable", "true"));
        } catch (IOException e) {
            System.err.println("No se pudo cargar logError.properties: " + e.getMessage());
        }
    }

    public static void logError(String message, Exception e) {
        if (!logEnabled) return;

        try (FileWriter writer = new FileWriter(logPath, true)) {
            writer.write("[" + LocalDateTime.now() + "] " + logLevel + ": " + message + "\n");
            writer.write("Exception: " + e.toString() + "\n");
            for (StackTraceElement elem : e.getStackTrace()) {
                writer.write("\tat " + elem.toString() + "\n");
            }
            writer.write("\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
