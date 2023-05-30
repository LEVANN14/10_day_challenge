package com.generate.link.generate_link.generate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface generate_link_db  extends JpaRepository<link_table, Integer>{
	List<link_table> findByinputLink(String input_link);
	List<link_table> findByoutputLink(String output_link);
}
