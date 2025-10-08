package SorcererChiragsingh.CashFlowLedger.service;

import org.springframework.stereotype.Service;
import SorcererChiragsingh.CashFlowLedger.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfileService 
{
    private final ProfileRepository profileRepository;
}
