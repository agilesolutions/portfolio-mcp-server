package com.agilesolutions.config;

import com.agilesolutions.tools.WalletTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider tools(WalletTools walletTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(walletTools)
                .build();
    }

}
