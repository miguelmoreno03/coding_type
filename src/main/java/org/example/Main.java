package org.example;

import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;

import org.example.GUI.App;

public class Main {
    public static void main(String[] args) {
        FlatCarbonIJTheme.setup();
        new App();
    }
}