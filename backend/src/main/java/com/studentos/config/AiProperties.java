package com.studentos.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.ai")
public class AiProperties {

    private String provider = "mock";
    private String openaiApiKey = "";
    private String geminiApiKey = "";

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getOpenaiApiKey() {
        return openaiApiKey;
    }

    public void setOpenaiApiKey(String openaiApiKey) {
        this.openaiApiKey = openaiApiKey;
    }

    public String getGeminiApiKey() {
        return geminiApiKey;
    }

    public void setGeminiApiKey(String geminiApiKey) {
        this.geminiApiKey = geminiApiKey;
    }

    public boolean isMockMode() {
        return "mock".equalsIgnoreCase(provider)
                || (openaiApiKey == null || openaiApiKey.isBlank())
                && (geminiApiKey == null || geminiApiKey.isBlank());
    }
}
