package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    static String usersLocation = "./src/test/resources/users.json";

    public static String randomPhoneNumberGenerator(int min,int max) {
       // int min = 300000000;
       // int max = 999999999;
        String randPhoneNumber = "01" + (int) (Math.random() * ((max - min) + 1));

        return randPhoneNumber;

    }

    public static String randomEmailGenerator() {
        int min = 1;
        int max = 999;
        String randEmail = "gmailuser" + (int) (Math.random() * ((max - min) + 1)) + "@gmail.com";

        return randEmail;

    }

    public static void savingUserData(JSONObject jsonObject) {
        try {
            JSONParser jsonParser = new JSONParser(); // JSONParser is used to read and understand JSON data from a file
            // Read the existing users.json file and convert it into a JSONArray
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(usersLocation));
            // Add the new user's data (jsonObject) to the existing user list
            jsonArray.add(jsonObject);

            // Convert the updated JSONArray back to JSON text and save it into the file
            savingInFile(usersLocation, jsonArray.toJSONString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // This method writes any text content into a file
    public static void savingInFile(String fileLocation, String content) {
        try {
            FileWriter fw = new FileWriter(fileLocation); // FileWriter opens the file in write mode
            fw.write(content);  // Write the given content (JSON text) into the file
            fw.flush(); // Ensure all data is properly written to the file
            fw.close();  // Close the file to free system resources
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // This method reads specific user information from the JSON file
    // pos = position of user (0 = first user, 1 = second user)
    // key = which value you want (email, password, etc.)
    public static String readingUserInformation(int pos, String key) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser(); // Create JSONParser to read JSON file
        Object obj = jsonParser.parse(new FileReader(usersLocation));  // Read the users.json file and parse it into a Java object
        JSONArray jsonArray = (JSONArray) obj; // Convert the parsed object into JSONArray
        JSONObject json = (JSONObject) jsonArray.get(pos); // Get a single user object based on the position (index)

        return json.get(key).toString(); // Return the value for the given key (example: email or password)
    }
}


