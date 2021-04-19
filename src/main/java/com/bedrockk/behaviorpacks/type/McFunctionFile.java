package com.bedrockk.behaviorpacks.type;

import lombok.Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Data
public class McFunctionFile {
    private boolean hidden = false;
    private LinkedList<String> lines = new LinkedList<>();

    public McFunctionFile(InputStream stream) throws IOException {
        this.load(stream);
    }

    public String[] getCommands() {
        return lines.stream().filter(line -> !line.startsWith("#")).toArray(String[]::new);
    }

    public String[] getComments() {
        return lines.stream().filter(line -> line.startsWith("#")).toArray(String[]::new);
    }

    public void load(InputStream stream) throws IOException {
        this.hidden = false;
        this.lines.clear();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line = br.readLine();
            if (line.equals("HIDE")) {
                this.hidden = true;
                line = br.readLine();
            }

            while (line != null) {
                this.lines.add(line);
                line = br.readLine();
            }
        }
    }

    public void save(File file) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            if (this.hidden) {
                writer.append("HIDE");
            }

            for (String line : lines) {
                writer.append(line);
            }
        }
    }
}
