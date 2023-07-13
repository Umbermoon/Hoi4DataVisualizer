package com.umber.visualizer.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ModReader {
    @Value("${mod.path}")
    private String modPath;

    @Value("${tech.path}")
    private String techPath;

    public String getModPath(){
        return modPath;
    }

    public String getTechPath(){
        return modPath + techPath;
    }

    public boolean hasTech(){
        File artFile = new File(modPath + techPath + "\\artillery.txt");
        return artFile.exists();
    }
}
