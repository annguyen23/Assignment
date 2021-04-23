import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.io.*;
import java.util.Locale;

public class HWLoopsFilesTests {

  // TODO: Investigate use of ErrorCollector to gather all test data at once

  private static BufferedReader reader;
  private static PrintStream consoleOutput;
  private static PipedOutputStream out;
  private static PipedInputStream testOutput;


  @Test
  public void checkWeights() throws IOException {
    HW_Loops_Files.main(null);
    Assert.assertEquals(0.30, HW_Loops_Files.programWeight, 0.01);
    Assert.assertEquals(0.30, HW_Loops_Files.midtermWeight, 0.01);
    Assert.assertEquals(0.40, HW_Loops_Files.finalWeight, 0.01);
  }

  @Test
  public void checkClass161() throws IOException, InterruptedException {
    ProcessBuilder builder = new ProcessBuilder("java", "HW_Loops_Files");
    builder.directory(new File("target/classes"));
    Process p = builder.start();
    int retCode = p.waitFor();
    BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
    String line = in.readLine();
    Assert.assertTrue(line.contains("161"));
    line = in.readLine(); line = in.readLine(); line = in.readLine();
    line = in.readLine();
    String[] actualData = line.split(" +");
    Assert.assertEquals("3333", actualData[0]);
    Assert.assertEquals("70", actualData[1]);
    Assert.assertEquals("60", actualData[2]);
    Assert.assertEquals("50", actualData[3]);
    Assert.assertEquals("59.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("4444", actualData[0]);
    Assert.assertEquals("50", actualData[1]);
    Assert.assertEquals("50", actualData[2]);
    Assert.assertEquals("50", actualData[3]);
    Assert.assertEquals("50.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "FAIL", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("5555", actualData[0]);
    Assert.assertEquals("80", actualData[1]);
    Assert.assertEquals("90", actualData[2]);
    Assert.assertEquals("80", actualData[3]);
    Assert.assertEquals("83.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split("[ +:]");
    Assert.assertEquals("Class student count incorrect.", "3", actualData[4]);
    Assert.assertEquals("64.00", actualData[6]);
  }

  @Test
  public void checkClass162() throws IOException, InterruptedException {
    ProcessBuilder builder = new ProcessBuilder("java", "HW_Loops_Files");
    builder.directory(new File("target/classes"));
    Process p = builder.start();
    int retCode = p.waitFor();
    BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
    String line;
    for (int i = 0; i < 9; i++) {
      line = in.readLine();
    }
    line = in.readLine();
    Assert.assertTrue(line.contains("162"));
    line = in.readLine(); line = in.readLine(); line = in.readLine();
    line = in.readLine();
    String[] actualData = line.split(" +");
    Assert.assertEquals("1212", actualData[0]);
    Assert.assertEquals("90", actualData[1]);
    Assert.assertEquals("85", actualData[2]);
    Assert.assertEquals("92", actualData[3]);
    Assert.assertEquals("89.30", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("6666", actualData[0]);
    Assert.assertEquals("60", actualData[1]);
    Assert.assertEquals("80", actualData[2]);
    Assert.assertEquals("90", actualData[3]);
    Assert.assertEquals("78.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "FAIL", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("7777", actualData[0]);
    Assert.assertEquals("90", actualData[1]);
    Assert.assertEquals("90", actualData[2]);
    Assert.assertEquals("90", actualData[3]);
    Assert.assertEquals("90.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("8888", actualData[0]);
    Assert.assertEquals("95", actualData[1]);
    Assert.assertEquals("87", actualData[2]);
    Assert.assertEquals("93", actualData[3]);
    Assert.assertEquals("91.80", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("9999", actualData[0]);
    Assert.assertEquals("75", actualData[1]);
    Assert.assertEquals("77", actualData[2]);
    Assert.assertEquals("73", actualData[3]);
    Assert.assertEquals("74.80", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split("[ +:]");
    Assert.assertEquals("Class student count incorrect.", "5", actualData[4]);
    Assert.assertEquals("Class average incorrect.", "84.78", actualData[6]);
  }

  @Test
  public void checkClass263() throws IOException, InterruptedException  {
    ProcessBuilder builder = new ProcessBuilder("java", "HW_Loops_Files");
    builder.directory(new File("target/classes"));
    Process p = builder.start();
    int retCode = p.waitFor();
    BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
    String line = in.readLine();
    for (int i = 0; i < 20; i++) {
      line = in.readLine();
    }
    Assert.assertTrue(line.contains("263"));
    line = in.readLine(); line = in.readLine(); line = in.readLine();
    line = in.readLine();
    String[] actualData = line.split(" +");
    Assert.assertEquals("2222", actualData[0]);
    Assert.assertEquals("90", actualData[1]);
    Assert.assertEquals("65", actualData[2]);
    Assert.assertEquals("75", actualData[3]);
    Assert.assertEquals("76.50", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("8989", actualData[0]);
    Assert.assertEquals("60", actualData[1]);
    Assert.assertEquals("40", actualData[2]);
    Assert.assertEquals("60", actualData[3]);
    Assert.assertEquals("54.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "FAIL", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split(" +");
    Assert.assertEquals("9090", actualData[0]);
    Assert.assertEquals("70", actualData[1]);
    Assert.assertEquals("80", actualData[2]);
    Assert.assertEquals("30", actualData[3]);
    Assert.assertEquals("57.00", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "PASS", actualData[5].toUpperCase(Locale.ROOT));
    line = in.readLine();
    actualData = line.split("[ +:]");
    Assert.assertEquals("Class student count incorrect.", "3", actualData[4]);
    Assert.assertEquals("Student pass/fail incorrect.", "62.50", actualData[6]);
  }
}
