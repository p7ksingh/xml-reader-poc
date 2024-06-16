package com.example.model;

public class Printer {

    public void printConfiguration(Configuration config) {
        if (config != null) {
            System.out.println("Application Name: " + config.getApplication().getName());
            System.out.println("Application Version: " + config.getApplication().getVersion());
            System.out.println("Settings:");
            for (Setting setting : config.getApplication().getSettings()) {
                System.out.println("  " + setting.getName() + " = " + setting.getValue());
            }
            System.out.println("Modules:");
            for (Module module : config.getModules()) {
                System.out.println("  Module ID: " + module.getId());
                System.out.println("  Module Name: " + module.getName());
                for (Parameter parameter : module.getParameters()) {
                    System.out.println("    " + parameter.getKey() + " = " + parameter.getValue());
                }
            }
        } else {
            System.out.println("No configuration data available.");
        }
    }
}
