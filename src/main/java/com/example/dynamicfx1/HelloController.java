package com.example.dynamicfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {

    ArrayList<String> l1 = new ArrayList<>();

    @FXML
    private Button bt1;

    @FXML
    VBox mainBox;

    @FXML
    private void load() throws FileNotFoundException {
        String fname = "C:\\Users\\student\\IdeaProjects\\DynamicFX1\\src\\main\\java\\com\\example\\dynamicfx1\\Input.txt";
        Scanner sc = new Scanner(new File(fname));
        while (sc.hasNext()) {
           String s = sc.next();
            l1.add(s);
        }
        for (String s1: l1
             ) {view(s1);
        }
    }
    private void view(String s) {
        mainBox.getChildren().add(new TextField(s));
    }
}

