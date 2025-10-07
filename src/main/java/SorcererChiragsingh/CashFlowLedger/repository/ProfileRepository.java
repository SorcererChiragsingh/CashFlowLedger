package SorcererChiragsingh.CashFlowLedger.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import SorcererChiragsingh.CashFlowLedger.entity.ProfileEntity;



public interface ProfileRepository extends JpaRepository
{
    // Select * from tbl_profiles where email = ?
    Optional<ProfileEntity> findByEmail(String email);



}
