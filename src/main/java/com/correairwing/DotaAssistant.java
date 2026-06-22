package com.correairwing;

import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@RegisterAiService
@ApplicationScoped
public interface DotaAssistant {

    
    String chat(String userMessage);

}
