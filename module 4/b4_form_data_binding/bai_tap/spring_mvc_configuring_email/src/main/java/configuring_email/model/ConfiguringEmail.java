package configuring_email.model;

import java.util.List;

public class ConfiguringEmail {
    private String language;
    private String pageSize;
    private List<String> spamFilters;
    private String signature;

    public ConfiguringEmail() {
    }

    public ConfiguringEmail(String language, String pageSize, List<String> spamFilters, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilters = spamFilters;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getSpamFilters() {
        return spamFilters;
    }

    public void setSpamFilters(List<String> spamFilters) {
        this.spamFilters = spamFilters;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
