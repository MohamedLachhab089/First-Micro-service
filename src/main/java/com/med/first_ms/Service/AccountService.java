package com.med.first_ms.Service;

import com.med.first_ms.Dto.BankAccountRequestDTO;
import com.med.first_ms.Dto.BankAccountResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
