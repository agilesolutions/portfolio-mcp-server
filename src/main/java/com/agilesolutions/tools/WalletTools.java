package com.agilesolutions.tools;


import com.agilesolutions.model.Share;
import com.agilesolutions.repository.WalletRepository;
import org.springframework.ai.tool.annotation.Tool;

import java.util.List;

public class WalletTools {

    private WalletRepository walletRepository;

    public WalletTools(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Tool(description = "Number of shares for each company in my wallet")
    public List<Share> getNumberOfShares() {
        return (List<Share>) walletRepository.findAll();
    }
}
