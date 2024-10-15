package com.med.first_ms;

import com.med.first_ms.Entity.BankAccount;
import com.med.first_ms.Enum.AccountType;
import com.med.first_ms.Repository.BankAccountRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class FirstMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstMicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BankAccountRepo bankAccountRepo) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                BankAccount bankAccount = BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
                        .balance(Math.random() * 1700)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                bankAccountRepo.save(bankAccount);
            }
        };
    }

}
