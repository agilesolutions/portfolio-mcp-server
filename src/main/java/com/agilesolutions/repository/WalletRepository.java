package com.agilesolutions.repository;

import com.agilesolutions.model.Share;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Share, Long> {
}