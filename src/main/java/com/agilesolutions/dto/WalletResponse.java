package com.agilesolutions.dto;

import com.agilesolutions.model.Share;

import java.util.List;

public record WalletResponse(List<Share> shares) {
}