package br.com.guifroes1984.dao;

import br.com.guifroes1984.POJO.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill, Integer> {
}
