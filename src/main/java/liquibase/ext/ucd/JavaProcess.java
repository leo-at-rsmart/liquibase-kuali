package liquibase.ext.ucd;

import java.io.File;
import java.io.IOException;

public class JavaProcess {

    private JavaProcess() {}

    public static int exec(Class<?> clazz) throws IOException,
                                               InterruptedException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome +
                File.separator + "bin" +
                File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String className = clazz.getCanonicalName();

        ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp", classpath, className);

        Process process = builder.start();
        process.waitFor();
        return process.exitValue();
    }

}