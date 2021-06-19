import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Main {

  private static String getFirstOccurence(String data) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < data.length(); i++) {
      char c = data.charAt(i);
      if (!result.toString().contains(String.valueOf(c))) {
        result.append(c);
      }
    }

    return result.toString();
  }

  private static String getSmallestLexicographical(String data) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < data.length(); i++) {
      char c = data.charAt(i);
      if (!result.toString().contains(String.valueOf(c))) {
        result.append(c);
      } else {
        getSmallestLexicographicalDetail(result, c);
      }
    }

    return result.toString();
  }

  private static String getSmallestLexicographicalDetail(StringBuilder result, char c) {
    int index = result.indexOf(String.valueOf(c));
    int size = result.length();
    for (int j = 0; j < size; j++) {
      if (index + j < size && result.charAt(index + j) < c) {
        result.deleteCharAt(index);
        return result.append(c).toString();
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    try {
      String path = Paths.get("src", "main", "resources", "file.txt").toFile().getAbsolutePath();
      File file = new File(path);
      FileInputStream fileInputStream = new FileInputStream(file);
      DataInputStream dataInputStream = new DataInputStream(fileInputStream);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
      String words = bufferedReader.readLine();

      System.out.print("First Occurence from left to right : " + getFirstOccurence(words) + "\n");
      System.out.print(
          "The smallest lexicographical order : " + getSmallestLexicographical(words) + "\n");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
