import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    // so basiclly parse the json
    // so we can use hashmap and like this we will have every value of our attribue
    // so for attribute we don't have any problem but value can be integer , or
    // string or array

    // or instead of all of this mapping i will just go through the string and look
    // for what i need

    private static void jsonParser(String s, String jsonPath) {
        // normally this problem is for regex

        // Map<String, String> map = new HashMap<>();
        // int size = s.length();
        // List<String> listObjects = Arrays.asList(s.substring(5, size -
        // 5).trim().split(":"));

        // int itter = 0;
        // for (String word : listObjects) {

        // itter++;
        // }

        if (jsonPath.substring(0, 2) != "$.")
            System.out.println("None");

        // here staert statement
        String query = jsonPath.substring(2, jsonPath.length());
        // so first split to know exact variable that we need
        List<String> characters = Arrays.asList(query.split("."));

        for (String c : characters) {
            // so to know if it's a real attribute there's two cases
            // case ordinary before it we have ," and after we have "
            // or it's on the first and we have before it {"

        }

    }

    public static void main(String[] args) {
        // System.out.println("BISMI ALLAH");

        String s = """
                    {
                    "store": {
                        "book": [
                        {
                            "category": "craftmanship",
                            "author": "Robert C Martin",
                            "title": "Clean Code",
                            "price": 27.95
                        },
                        {
                            "category": "none-fiction",
                            "author": "Chris Fenning",
                            "title": "The first minute",
                            "price": 12.99
                        }
                        ],
                        "addreCharacterss": "21 B baker street"
                    }
                    }
                """;
        String query = "$.store.books[0].category";
        jsonParser(s, query);
    }
}