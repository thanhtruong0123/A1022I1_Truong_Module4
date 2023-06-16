package com.codegym.service;

import com.codegym.model.Config;

public interface ConfigService {
    Config getConfig();
    void updateConfig(Config config);
}
