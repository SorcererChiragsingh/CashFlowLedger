package SorcererChiragsingh.CashFlowLedger.service;

import org.springframework.stereotype.Service;


import SorcererChiragsingh.CashFlowLedger.repository.ProfileRepository;


import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class ProfileService 
{
    private final ProfileRepository profileRepository;
    
}
