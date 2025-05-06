package com.agilesolutions.service;

import com.agilesolutions.dto.WalletResponse;
import com.agilesolutions.model.Share;
import com.agilesolutions.repository.WalletRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletResponse get() {
        return new WalletResponse((List<Share>) walletRepository.findAll());
    }
}
