package com.ers.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ers.models.Reimbursement;


@Repository("reimbursementDao")
@Transactional
public interface ReimbursementDao extends JpaRepository<Reimbursement, Integer> {

    @Query("from Reimbursement where author = :author")
    List<Reimbursement> findReimbursementByAuthor(Integer author);
    @Query("from Reimbursement where resolver = :resolverId")
    List<Reimbursement> findReimbursementByResolver(Integer resolverId);
}
