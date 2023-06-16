package com.codegym.service;

import com.codegym.model.Config;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {
    private static Config configuration;

    static {
        configuration = new Config("English", 25, false, "Thor");
    }

    @Override
    public Config getConfig() {
        return configuration;
    }

    @Override
    public void updateConfig(Config config) {
        configuration = config;
    }
}
