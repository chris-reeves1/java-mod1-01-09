package Nfiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;

public class FileJsonHelper {
    private static final Gson GSON = new Gson();

    private FileJsonHelper(){}


    // to and from text
    public static String readText(Path path) throws Exception {
        return Files.readString(path);
    }
    public static void writeText(Path path, String content) throws Exception {
        Files.writeString(path, content, StandardCharsets.UTF_8);
    }
    
    // json writeto + readjson. 
    public static <T> void writeJson(Path path, T obj) throws Exception {
        writeText(path, GSON.toJson(obj));
    }
    public static <T> T readJson(Path path, Class<T> type) throws Exception{
        return GSON.fromJson(readText(path), type);
    }

}
 
